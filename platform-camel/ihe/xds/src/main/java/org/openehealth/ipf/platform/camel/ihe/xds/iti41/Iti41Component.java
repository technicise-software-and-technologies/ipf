/*
 * Copyright 2009 the original author or authors.
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
package org.openehealth.ipf.platform.camel.ihe.xds.iti41;

import org.apache.camel.Endpoint;
import org.openehealth.ipf.commons.ihe.ws.JaxWsClientFactory;
import org.openehealth.ipf.commons.ihe.ws.WsTransactionConfiguration;
import org.openehealth.ipf.commons.ihe.xds.core.audit.XdsSubmitAuditDataset;
import org.openehealth.ipf.platform.camel.ihe.ws.AbstractWsEndpoint;
import org.openehealth.ipf.platform.camel.ihe.ws.AbstractWsProducer;
import org.openehealth.ipf.platform.camel.ihe.xds.XdsComponent;
import org.openehealth.ipf.platform.camel.ihe.xds.XdsEndpoint;

import javax.xml.namespace.QName;
import java.util.Map;

import static org.openehealth.ipf.commons.ihe.xds.XDS_B.Interactions.ITI_41;

/**
 * The Camel component for the ITI-41 transaction.
 */
public class Iti41Component extends XdsComponent<XdsSubmitAuditDataset> {

    public static final String TARGET_HCID_NS = "urn:ihe.net:iti:xdr:2014";
    public static final String TARGET_HCID_NS_PREFIX = "xcdr";
    public static final String TARGET_HCID_BLOCK_LOCAL_PART = "homeCommunityBlock";
    public static final String TARGET_HCID_LOCAL_PART = "homeCommunityId";
    public static final QName  TARGET_HCID_HEADER_NAME = new QName(TARGET_HCID_NS, TARGET_HCID_BLOCK_LOCAL_PART, TARGET_HCID_NS_PREFIX);

    public Iti41Component() {
        super(ITI_41);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return new XdsEndpoint<XdsSubmitAuditDataset>(uri, remaining, this,
                getCustomInterceptors(parameters),
                getFeatures(parameters),
                getSchemaLocations(parameters),
                getProperties(parameters),
                Iti41Service.class) {
            @Override
            public AbstractWsProducer<XdsSubmitAuditDataset, WsTransactionConfiguration, ?, ?> getProducer(
                    AbstractWsEndpoint<XdsSubmitAuditDataset, WsTransactionConfiguration> endpoint,
                    JaxWsClientFactory<XdsSubmitAuditDataset> clientFactory)
            {
                return new Iti41Producer(endpoint, clientFactory);
            }
        };
    }

}
