/*
 * Copyright 2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.ihe.xds;

import org.apache.camel.Processor;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.EbXMLAdhocQueryRequest21;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.EbXMLProvideAndRegisterDocumentSetRequest21;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.EbXMLQueryResponse21;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.EbXMLRegistryResponse21;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.EbXMLSubmitObjectsRequest21;
import org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml21.ProvideAndRegisterDocumentSetRequestType;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.query.AdhocQueryRequest;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rs.RegistryResponse;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rs.SubmitObjectsRequest;
import org.openehealth.ipf.commons.ihe.xds.core.validate.requests.AdhocQueryRequestValidator;
import org.openehealth.ipf.commons.ihe.xds.core.validate.requests.ProvideAndRegisterDocumentSetRequestValidator;
import org.openehealth.ipf.commons.ihe.xds.core.validate.requests.SubmitObjectsRequestValidator;
import org.openehealth.ipf.commons.ihe.xds.core.validate.responses.QueryResponseValidator;
import org.openehealth.ipf.commons.ihe.xds.core.validate.responses.RegistryResponseValidator;

import static org.openehealth.ipf.commons.ihe.xds.XDS_A.Interactions.ITI_14;
import static org.openehealth.ipf.commons.ihe.xds.XDS_A.Interactions.ITI_15;
import static org.openehealth.ipf.commons.ihe.xds.XDS_A.Interactions.ITI_16;
import static org.openehealth.ipf.platform.camel.core.adapter.ValidatorAdapter.validationEnabled;

/**
 * Validating processors for ebXML 2.1-based IPF XDS.a components.
 * <p>
 * These processors are placed in a separate class instead of be put together
 * with ebXML 3.0 XDS.b ones in order to prevent import salad.
 *
 * @author Dmytro Rud
 */
abstract public class XdsACamelValidators {

    private static final Processor ITI_14_REQUEST_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLSubmitObjectsRequest21 message =
            new EbXMLSubmitObjectsRequest21(exchange.getIn().getBody(SubmitObjectsRequest.class));
        new SubmitObjectsRequestValidator().validate(message, ITI_14);
    };

    private static final Processor ITI_14_RESPONSE_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLRegistryResponse21 message =
            new EbXMLRegistryResponse21(exchange.getIn().getBody(RegistryResponse.class));
        new RegistryResponseValidator().validate(message, ITI_14);
    };


    private static final Processor ITI_15_REQUEST_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLProvideAndRegisterDocumentSetRequest21 message =
            new EbXMLProvideAndRegisterDocumentSetRequest21(
                    exchange.getIn().getBody(ProvideAndRegisterDocumentSetRequestType.class));
        new ProvideAndRegisterDocumentSetRequestValidator().validate(message, ITI_15);
    };

    private static final Processor ITI_15_RESPONSE_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLRegistryResponse21 message =
            new EbXMLRegistryResponse21(exchange.getIn().getBody(RegistryResponse.class));
        new RegistryResponseValidator().validate(message, ITI_15);
    };

    private static final Processor ITI_16_REQUEST_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLAdhocQueryRequest21 message =
            new EbXMLAdhocQueryRequest21(exchange.getIn().getBody(AdhocQueryRequest.class));
        new AdhocQueryRequestValidator().validate(message, ITI_16);
    };

    private static final Processor ITI_16_RESPONSE_VALIDATOR = exchange -> {
        if (! validationEnabled(exchange)) {
            return;
        }
        EbXMLQueryResponse21 message =
            new EbXMLQueryResponse21(exchange.getIn().getBody(RegistryResponse.class));
        new QueryResponseValidator().validate(message, ITI_16);
    };


    /**
     * Returns a validating processor for ITI-14 request messages.
     */
    public static Processor iti14RequestValidator() {
        return ITI_14_REQUEST_VALIDATOR;
    }

    /**
     * Returns a validating processor for ITI-14 response messages.
     */
    public static Processor iti14ResponseValidator() {
        return ITI_14_RESPONSE_VALIDATOR;
    }

    /**
     * Returns a validating processor for ITI-15 request messages.
     */
    public static Processor iti15RequestValidator() {
        return ITI_15_REQUEST_VALIDATOR;
    }

    /**
     * Returns a validating processor for ITI-15 response messages.
     */
    public static Processor iti15ResponseValidator() {
        return ITI_15_RESPONSE_VALIDATOR;
    }

    /**
     * Returns a validating processor for ITI-16 request messages.
     */
    public static Processor iti16RequestValidator() {
        return ITI_16_REQUEST_VALIDATOR;
    }

    /**
     * Returns a validating processor for ITI-16 response messages.
     */
    public static Processor iti16ResponseValidator() {
        return ITI_16_RESPONSE_VALIDATOR;
    }

}
