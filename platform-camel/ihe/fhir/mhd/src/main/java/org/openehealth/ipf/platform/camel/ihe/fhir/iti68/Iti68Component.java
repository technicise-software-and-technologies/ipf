/*
 * Copyright 2016 the original author or authors.
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

package org.openehealth.ipf.platform.camel.ihe.fhir.iti68;

import org.apache.camel.component.servlet.ServletComponent;
import org.apache.camel.component.servlet.ServletEndpoint;
import org.apache.camel.http.common.HttpMethods;

import java.net.URI;

/**
 * Component for MHD Retrieve Document (ITI-68)
 *
 * @author Christian Ohr
 * @since 3.2
 */
public class Iti68Component extends ServletComponent {

    public Iti68Component() {
        super(Iti68Endpoint.class);
    }

    @Override
    protected ServletEndpoint createServletEndpoint(String endpointUri, ServletComponent component, URI httpUri) throws Exception {
        ServletEndpoint endpoint = new Iti68Endpoint(endpointUri, component, httpUri);
        endpoint.setHttpMethodRestrict(HttpMethods.GET.name());
        return endpoint;
    }

    @Override
    protected boolean lenientContextPath() {
        return false;
    }
}
