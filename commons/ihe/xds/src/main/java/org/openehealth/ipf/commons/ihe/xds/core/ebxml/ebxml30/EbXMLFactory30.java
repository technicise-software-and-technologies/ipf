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
package org.openehealth.ipf.commons.ihe.xds.core.ebxml.ebxml30;

import org.openehealth.ipf.commons.ihe.xds.core.ebxml.*;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.lcm.RemoveObjectsRequest;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.lcm.SubmitObjectsRequest;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query.AdhocQueryRequest;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query.AdhocQueryResponse;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query.ResponseOptionType;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rim.*;
import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rs.RegistryError;

/**
 * Factory for EbXML 3.0 objects.
 * @author Jens Riemschneider
 */
public class EbXMLFactory30 implements EbXMLFactory {
    /**
     * The factory to create objects of the query namespace.
     */
    public final static org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query.ObjectFactory QUERY_FACTORY =
        new org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.query.ObjectFactory();

    /**
     * The factory to create objects of the rim namespace.
     */
    public final static org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rim.ObjectFactory RIM_FACTORY =
        new org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rim.ObjectFactory();

    /**
     * The factory to create objects of the rs namespace.
     */
    public final static org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rs.ObjectFactory RS_FACTORY =
        new org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.rs.ObjectFactory();

    /**
     * The factory to create objects of the lcm namespace.
     */
    public final static org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.lcm.ObjectFactory LCM_FACTORY =
        new org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs30.lcm.ObjectFactory();

    @Override
    public EbXMLClassification createClassification(EbXMLObjectLibrary objectLibrary) {
        return new EbXMLClassification30(RIM_FACTORY.createClassificationType());
    }

    @Override
    public EbXMLExtrinsicObject createExtrinsic(String id, EbXMLObjectLibrary objectLibrary) {
        ExtrinsicObjectType extrinsicObjectType = RIM_FACTORY.createExtrinsicObjectType();
        extrinsicObjectType.setId(id);
        objectLibrary.put(id, extrinsicObjectType);
        return new EbXMLExtrinsicObject30(extrinsicObjectType, objectLibrary);
    }

    @Override
    public EbXMLRegistryPackage createRegistryPackage(String id, EbXMLObjectLibrary objectLibrary) {
        RegistryPackageType registryPackageType = RIM_FACTORY.createRegistryPackageType();
        registryPackageType.setId(id);
        objectLibrary.put(id, registryPackageType);
        return new EbXMLRegistryPackage30(registryPackageType, objectLibrary);
    }

    @Override
    public EbXMLAssociation createAssociation(String id, EbXMLObjectLibrary objectLibrary) {
        AssociationType1 association = RIM_FACTORY.createAssociationType1();
        association.setId(id);
        objectLibrary.put(id, association);
        return new EbXMLAssociation30(association, objectLibrary);
    }
    
    @Override
    public EbXMLSubmitObjectsRequest createSubmitObjectsRequest() {
        SubmitObjectsRequest request = LCM_FACTORY.createSubmitObjectsRequest();
        request.setRegistryObjectList(RIM_FACTORY.createRegistryObjectListType());
        request.setRequestSlotList(RIM_FACTORY.createSlotListType());
        return new EbXMLSubmitObjectsRequest30(request, createObjectLibrary());
    }

    @Override
    public EbXMLProvideAndRegisterDocumentSetRequest createProvideAndRegisterDocumentSetRequest(EbXMLObjectLibrary objectLibrary) {
        ProvideAndRegisterDocumentSetRequestType request = new ProvideAndRegisterDocumentSetRequestType();
        request.setSubmitObjectsRequest((SubmitObjectsRequest) createSubmitObjectsRequest().getInternal());
        return new EbXMLProvideAndRegisterDocumentSetRequest30(request, objectLibrary);
    }
    
    @Override
    public EbXMLRetrieveDocumentSetRequest createRetrieveDocumentSetRequest() {
        return new EbXMLRetrieveDocumentSetRequest30(new RetrieveDocumentSetRequestType());
    }
    
    @Override
    public EbXMLRetrieveImagingDocumentSetRequest createRetrieveImagingDocumentSetRequest() {
        return new EbXMLRetrieveImagingDocumentSetRequest30(new RetrieveImagingDocumentSetRequestType());
    }

    @Override
    public EbXMLObjectLibrary createObjectLibrary() {
        return new EbXMLObjectLibrary();
    }

    @Override
    public EbXMLRegistryResponse createRegistryResponse() {
        return new EbXMLRegistryResponse30(RS_FACTORY.createRegistryResponseType());
    }

    @Override
    public EbXMLRetrieveDocumentSetResponse createRetrieveDocumentSetResponse() {
        RetrieveDocumentSetResponseType response = new RetrieveDocumentSetResponseType();
        response.setRegistryResponse(RS_FACTORY.createRegistryResponseType());
        return new EbXMLRetrieveDocumentSetResponse30(response);
    }
    
    @Override
    public EbXMLAdhocQueryRequest createAdhocQueryRequest() {
        AdhocQueryRequest request = QUERY_FACTORY.createAdhocQueryRequest();
        
        ResponseOptionType responseOption = QUERY_FACTORY.createResponseOptionType();
        responseOption.setReturnComposedObjects(true);
        request.setResponseOption(responseOption);

        AdhocQueryType query = RIM_FACTORY.createAdhocQueryType();
        request.setAdhocQuery(query);
        
        return new EbXMLAdhocQueryRequest30(request);        
    }
    
    @Override
    public EbXMLQueryResponse createAdhocQueryResponse(EbXMLObjectLibrary objectLibrary, boolean returnsObjectRefs) {
        AdhocQueryResponse response = QUERY_FACTORY.createAdhocQueryResponse();
        response.setRegistryObjectList(RIM_FACTORY.createRegistryObjectListType());
        return new EbXMLQueryResponse30(response, objectLibrary);
    }

    @Override
    public EbXMLRegistryError createRegistryError() {
        RegistryError registryError = RS_FACTORY.createRegistryError();
        return new EbXMLRegistryError30(registryError);
    }

    @Override
    public EbXMLRemoveObjectsRequest createRemoveObjectsRequest() {
        RemoveObjectsRequest removeObjectsRequest = LCM_FACTORY.createRemoveObjectsRequest();
        removeObjectsRequest.setAdhocQuery(RIM_FACTORY.createAdhocQueryType());
        return new EbXMLRemoveObjectsRequest30(removeObjectsRequest);
    }
}
