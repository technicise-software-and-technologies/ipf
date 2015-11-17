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

package org.openehealth.ipf.platform.camel.ihe.fhir.core;

import org.openehealth.ipf.commons.ihe.fhir.ClientRequestFactory;
import org.openehealth.ipf.commons.ihe.fhir.FhirAuditDataset;

/**
 * Static configuration for FHIR components. This configuration cannot be altered in the
 * endpoint URI.
 *
 * @since 3.1
 */
public class FhirComponentConfiguration<AuditDatasetType extends FhirAuditDataset> {

    private final AbstractResourceProvider<AuditDatasetType> staticResourceProvider;
    private final ClientRequestFactory<?> staticClientRequestFactory;

    public FhirComponentConfiguration(
        AbstractResourceProvider<AuditDatasetType> resourceProvider,
            ClientRequestFactory<?> clientRequestFactory) {
        this.staticResourceProvider = resourceProvider;
        this.staticClientRequestFactory = clientRequestFactory;
    }

    public AbstractResourceProvider<AuditDatasetType> getStaticResourceProvider() {
        return staticResourceProvider;
    }

    public ClientRequestFactory<?> getStaticClientRequestFactory() {
        return staticClientRequestFactory;
    }


}