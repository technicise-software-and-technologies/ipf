/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openehealth.ipf.tutorials.fhir

import org.apache.camel.builder.RouteBuilder
import org.openehealth.ipf.commons.ihe.fhir.iti83.PixQueryResponseToPixmResponseTranslator
import org.openehealth.ipf.commons.ihe.fhir.iti83.PixmRequestToPixQueryTranslator
import org.openehealth.ipf.commons.ihe.fhir.translation.TranslatorFhirToHL7v2
import org.openehealth.ipf.commons.ihe.fhir.translation.TranslatorHL7v2ToFhir
import org.openehealth.ipf.commons.ihe.fhir.translation.UriMapper

import static org.openehealth.ipf.platform.camel.ihe.fhir.translation.FhirCamelTranslators.translatorFhirToHL7v2
import static org.openehealth.ipf.platform.camel.ihe.fhir.translation.FhirCamelTranslators.translatorHL7v2ToFhir

/**
 *
 */
class Iti83RouteBuilder extends RouteBuilder {

    private final TranslatorFhirToHL7v2 requestTranslator
    private final TranslatorHL7v2ToFhir responseTranslator
    private final String host;
    private final int port

    public Iti83RouteBuilder(UriMapper uriMapper, String host, int iti9Port) {
        super();
        this.requestTranslator = new PixmRequestToPixQueryTranslator(uriMapper);
        this.responseTranslator = new PixQueryResponseToPixmResponseTranslator(uriMapper);
        this.host = host;
        this.port = iti9Port
    }

    @Override
    public void configure() throws Exception {
        from("pixm-iti83:translation?audit=true")
                .errorHandler(noErrorHandler())
        // Translate into ITI-9 QBP_Q23
                .process(translatorFhirToHL7v2(requestTranslator))
        // Call ITI-9 endpoint
                .to("pix-iti9:${host}:${port}")
        // Translate back into FHIR
                .process(translatorHL7v2ToFhir(responseTranslator))
    }
}