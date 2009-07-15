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
package org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.requests;

import static org.apache.commons.lang.Validate.notNull;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_AUTHOR_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_CLASS_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_CLASS_NODE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_CONFIDENTIALITY_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_EVENT_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_FORMAT_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_HEALTHCARE_FACILITY_TYPE_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_PATIENT_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_PRACTICE_SETTING_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_TYPE_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.DOC_ENTRY_UNIQUE_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.FOLDER_CLASS_NODE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.FOLDER_CODE_LIST_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.FOLDER_PATIENT_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.FOLDER_UNIQUE_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_AUTHOR_INSTITUTION;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_AUTHOR_PERSON;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_AUTHOR_ROLE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_AUTHOR_SPECIALTY;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_CODING_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_CREATION_TIME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_HASH;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_INTENDED_RECIPIENT;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_LANGUAGE_CODE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_LAST_UPDATE_TIME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_LEGAL_AUTHENTICATOR;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SERVICE_START_TIME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SERVICE_STOP_TIME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SIZE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SOURCE_PATIENT_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SOURCE_PATIENT_INFO;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SUBMISSION_SET_STATUS;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_SUBMISSION_TIME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SLOT_NAME_URI;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_AUTHOR_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_CLASS_NODE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_CONTENT_TYPE_CODE_CLASS_SCHEME;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_PATIENT_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_SOURCE_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary.SUBMISSION_SET_UNIQUE_ID_EXTERNAL_ID;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.DOC_ENTRY_INVALID_AVAILABILITY_STATUS;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.DOC_ENTRY_PATIENT_ID_WRONG;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.EXACTLY_ONE_SUBMISSION_SET_MUST_EXIST;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.FOLDER_INVALID_AVAILABILITY_STATUS;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.FOLDER_PATIENT_ID_WRONG;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.INVALID_ASSOCIATION_TYPE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.INVALID_SUBMISSION_SET_STATUS;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.INVALID_TITLE_ENCODING;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.MISSING_ORIGINAL;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.SOURCE_UUID_NOT_FOUND;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.SUBMISSION_SET_INVALID_AVAILABILITY_STATUS;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.TITLE_TOO_LONG;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.TOO_MANY_SUBMISSION_SET_STATES;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.UNIQUE_ID_MISSING;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.UNIQUE_ID_NOT_UNIQUE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.UNIQUE_ID_TOO_LONG;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationMessage.UUID_NOT_UNIQUE;
import static org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidatorAssertions.metaDataAssert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openehealth.ipf.commons.core.modules.api.Validator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLAssociation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLExtrinsicObject;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLObjectContainer;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLRegistryObject;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLRegistryPackage;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.AssociationLabel;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.AssociationType;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.AvailabilityStatus;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.LocalizedString;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.CXValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ClassificationValidation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ExternalIdentifierValidation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.HashValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.LanguageCodeValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.NopValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.OIDValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.PidValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.PositiveNumberValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.RecipientListValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.RegistryObjectValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.SlotLengthValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.SlotValidation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.SlotValueValidation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.TimeValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.UriValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.ValidationProfile;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.XCNValidator;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.XDSMetaDataException;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.validate.XONValidator;

/**
 * Validation of an ebXML object container.
 * @author Jens Riemschneider
 */
public class ObjectContainerValidator implements Validator<EbXMLObjectContainer, ValidationProfile> {

    private final SlotLengthValidator slotLengthValidator = new SlotLengthValidator();
    private final OIDValidator oidValidator = new OIDValidator();
    private final TimeValidator timeValidator = new TimeValidator();
    private final XCNValidator xcnValidator = new XCNValidator();
    private final XONValidator xonValidator = new XONValidator();
    private final HashValidator hashValidator = new HashValidator();
    private final NopValidator nopValidator = new NopValidator();
    private final LanguageCodeValidator languageCodeValidator = new LanguageCodeValidator();
    private final PositiveNumberValidator positiveNumberValidator = new PositiveNumberValidator();
    private final PidValidator pidValidator = new PidValidator();
    private final UriValidator uriValidator = new UriValidator();
    private final RecipientListValidator recipientListValidator = new RecipientListValidator();
    private final CXValidator cxValidator = new CXValidator();
    
    private final SlotValueValidation[] authorValidations = new SlotValueValidation[] {
                new SlotValueValidation(SLOT_NAME_AUTHOR_PERSON, xcnValidator),
                new SlotValueValidation(SLOT_NAME_AUTHOR_INSTITUTION, xonValidator, 0, Integer.MAX_VALUE),
                new SlotValueValidation(SLOT_NAME_AUTHOR_ROLE, nopValidator, 0, Integer.MAX_VALUE),
                new SlotValueValidation(SLOT_NAME_AUTHOR_SPECIALTY, nopValidator, 0, Integer.MAX_VALUE)};
    
    private final SlotValueValidation[] codingSchemeValidations = new SlotValueValidation[] {
                new SlotValueValidation(SLOT_NAME_CODING_SCHEME, nopValidator)};
    
    private final RegistryObjectValidator[] docEntrySlotValidations = new RegistryObjectValidator[] {
                new SlotValueValidation(SLOT_NAME_CREATION_TIME, timeValidator),
                new SlotValueValidation(SLOT_NAME_SERVICE_START_TIME, timeValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_SERVICE_STOP_TIME, timeValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_HASH, hashValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_LANGUAGE_CODE, languageCodeValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_LEGAL_AUTHENTICATOR, xcnValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_SIZE, positiveNumberValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_SOURCE_PATIENT_ID, nopValidator, 0, 1),
                new SlotValueValidation(SLOT_NAME_SOURCE_PATIENT_INFO, pidValidator, 0, Integer.MAX_VALUE),
                new SlotValidation(SLOT_NAME_URI, uriValidator),
                new ClassificationValidation(DOC_ENTRY_AUTHOR_CLASS_SCHEME, authorValidations),
                new ClassificationValidation(DOC_ENTRY_CLASS_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_CONFIDENTIALITY_CODE_CLASS_SCHEME, 0, Integer.MAX_VALUE, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_EVENT_CODE_CLASS_SCHEME, 0, Integer.MAX_VALUE, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_FORMAT_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_HEALTHCARE_FACILITY_TYPE_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_PRACTICE_SETTING_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ClassificationValidation(DOC_ENTRY_TYPE_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ExternalIdentifierValidation(DOC_ENTRY_PATIENT_ID_EXTERNAL_ID, cxValidator)};
    
    private final RegistryObjectValidator[] submissionSetSlotValidations = new RegistryObjectValidator[] {
                new SlotValidation(SLOT_NAME_INTENDED_RECIPIENT, recipientListValidator),
                new SlotValueValidation(SLOT_NAME_SUBMISSION_TIME, timeValidator),
                new ClassificationValidation(SUBMISSION_SET_AUTHOR_CLASS_SCHEME, authorValidations),
                new ClassificationValidation(SUBMISSION_SET_CONTENT_TYPE_CODE_CLASS_SCHEME, codingSchemeValidations),
                new ExternalIdentifierValidation(SUBMISSION_SET_PATIENT_ID_EXTERNAL_ID, cxValidator),
                new ExternalIdentifierValidation(SUBMISSION_SET_SOURCE_ID_EXTERNAL_ID, oidValidator)};
    
    private final RegistryObjectValidator[] folderSlotValidations = new RegistryObjectValidator[] {
                new SlotValueValidation(SLOT_NAME_LAST_UPDATE_TIME, timeValidator, 0, 1),
                new ClassificationValidation(FOLDER_CODE_LIST_CLASS_SCHEME, 1, Integer.MAX_VALUE, codingSchemeValidations),
                new ExternalIdentifierValidation(FOLDER_PATIENT_ID_EXTERNAL_ID, cxValidator)};

    public void validate(EbXMLObjectContainer container, ValidationProfile profile) {
        notNull(container, "container cannot be null");
        
        if (profile == null) {
            profile = new ValidationProfile();
        }
        
        slotLengthValidator.validate(container);
    
        // Note: The order of these checks is important!        
        validateSubmissionSet(container, profile);
        if (!profile.isQuery()) {
            validateUniquenessOfUUIDs(container);
            validateUniquenessOfUniqueIds(container);
        }
        validateAssociations(container, profile);
        validateDocumentEntries(container);
        validateFolders(container);
        if (!profile.isQuery()) {
            validatePatientIdsAreIdentical(container);
        } 
    }

    private void validateFolders(EbXMLObjectContainer container) throws XDSMetaDataException {
        for (EbXMLRegistryPackage folder : container.getRegistryPackages(FOLDER_CLASS_NODE)) {
            runValidations(folder, folderSlotValidations);
    
            AvailabilityStatus status = folder.getStatus();
            if (status != null) {
                metaDataAssert(status == AvailabilityStatus.APPROVED || status == AvailabilityStatus.SUBMITTED,
                        FOLDER_INVALID_AVAILABILITY_STATUS, status);
            }
        }
    }

    private void validateSubmissionSet(EbXMLObjectContainer container, ValidationProfile profile) throws XDSMetaDataException {
        List<EbXMLRegistryPackage> submissionSets = container.getRegistryPackages(SUBMISSION_SET_CLASS_NODE);
        if (!profile.isQuery()) {
            metaDataAssert(submissionSets.size() == 1, EXACTLY_ONE_SUBMISSION_SET_MUST_EXIST);
        }
    
        for (EbXMLRegistryPackage submissionSet : submissionSets) {
            runValidations(submissionSet, submissionSetSlotValidations);
        
            AvailabilityStatus status = submissionSet.getStatus();
            if (status != null) {
                metaDataAssert(status == AvailabilityStatus.APPROVED || status == AvailabilityStatus.SUBMITTED,
                        SUBMISSION_SET_INVALID_AVAILABILITY_STATUS, status);
            }
        }
    }

    private void validateDocumentEntries(EbXMLObjectContainer container) throws XDSMetaDataException {
        for (EbXMLExtrinsicObject docEntry : container.getExtrinsicObjects(DOC_ENTRY_CLASS_NODE)) {
            runValidations(docEntry, docEntrySlotValidations);
            
            AvailabilityStatus status = docEntry.getStatus();
            if (status != null) {
                metaDataAssert(status == AvailabilityStatus.APPROVED || status == AvailabilityStatus.DEPRECATED,
                        DOC_ENTRY_INVALID_AVAILABILITY_STATUS, status);
            }
            
            LocalizedString name = docEntry.getName();
            if (name != null && name.getValue() != null) {
                metaDataAssert("UTF8".equals(name.getCharset()),
                        INVALID_TITLE_ENCODING, name.getCharset());
                
                metaDataAssert(name.getValue().length() <= 128,
                        TITLE_TOO_LONG, name.getValue());
            }
        }
    }

    private void runValidations(EbXMLRegistryObject obj, RegistryObjectValidator[] validations) throws XDSMetaDataException {
        for (RegistryObjectValidator validation : validations) {
            validation.validate(obj);
        }
    }

    private void validateUniquenessOfUniqueIds(EbXMLObjectContainer container) throws XDSMetaDataException {
        Set<String> uniqueIds = new HashSet<String>();
        addUniqueIds(container.getExtrinsicObjects(DOC_ENTRY_CLASS_NODE), uniqueIds, DOC_ENTRY_UNIQUE_ID_EXTERNAL_ID);
        addUniqueIds(container.getRegistryPackages(FOLDER_CLASS_NODE), uniqueIds, FOLDER_UNIQUE_ID_EXTERNAL_ID);
        addUniqueIds(container.getRegistryPackages(SUBMISSION_SET_CLASS_NODE), uniqueIds, SUBMISSION_SET_UNIQUE_ID_EXTERNAL_ID);
    }

    private void addUniqueIds(List<? extends EbXMLRegistryObject> objects, Set<String> uniqueIds, String scheme) throws XDSMetaDataException {
        for (EbXMLRegistryObject obj : objects) {
            String uniqueId = obj.getExternalIdentifierValue(scheme);
            metaDataAssert(uniqueId != null, UNIQUE_ID_MISSING);
            metaDataAssert(uniqueId.length() <= 64, UNIQUE_ID_TOO_LONG);
            
            if (uniqueId != null) {
                metaDataAssert(!uniqueIds.contains(uniqueId), UNIQUE_ID_NOT_UNIQUE);
                uniqueIds.add(uniqueId);
            }
        }
    }

    private void validateUniquenessOfUUIDs(EbXMLObjectContainer container) throws XDSMetaDataException {
        Set<String> uuids = new HashSet<String>();
        addUUIDs(container.getAssociations(), uuids);
        addUUIDs(container.getExtrinsicObjects(), uuids);
        addUUIDs(container.getRegistryPackages(), uuids);
    }

    private void addUUIDs(List<? extends EbXMLRegistryObject> objects, Set<String> uuids) throws XDSMetaDataException {
        for (EbXMLRegistryObject obj : objects) {
            String uuid = obj.getId();
            if (uuid != null) {
                metaDataAssert(!uuids.contains(uuid), UUID_NOT_UNIQUE);
                uuids.add(uuid);
            }
        }
    }

    private void validatePatientIdsAreIdentical(EbXMLObjectContainer container) throws XDSMetaDataException {
        List<EbXMLRegistryPackage> submissionSets = container.getRegistryPackages(SUBMISSION_SET_CLASS_NODE);
        EbXMLRegistryPackage submissionSet = submissionSets.get(0);
    
        String patientId = submissionSet.getExternalIdentifierValue(SUBMISSION_SET_PATIENT_ID_EXTERNAL_ID);
    
        for (EbXMLExtrinsicObject docEntry : container.getExtrinsicObjects(DOC_ENTRY_CLASS_NODE)) {
            String patientIdDocEntry = docEntry.getExternalIdentifierValue(DOC_ENTRY_PATIENT_ID_EXTERNAL_ID);
            metaDataAssert(patientId.equals(patientIdDocEntry), DOC_ENTRY_PATIENT_ID_WRONG);
        }
        
        for (EbXMLRegistryPackage folder : container.getRegistryPackages(FOLDER_CLASS_NODE)) {
            String patientIdFolder = folder.getExternalIdentifierValue(FOLDER_PATIENT_ID_EXTERNAL_ID);
            metaDataAssert(patientId.equals(patientIdFolder), FOLDER_PATIENT_ID_WRONG);
        }
    }

    private void validateAssociations(EbXMLObjectContainer container, ValidationProfile profile) throws XDSMetaDataException {
        Set<String> docEntryIds = new HashSet<String>();
        for (EbXMLExtrinsicObject docEntry : container.getExtrinsicObjects(DOC_ENTRY_CLASS_NODE)) {
            if (docEntry.getId() != null) {
                docEntryIds.add(docEntry.getId());
            }
        }
        
        for (EbXMLAssociation association : container.getAssociations()) {
            AssociationType type = association.getAssociationType();
            metaDataAssert(type != null, INVALID_ASSOCIATION_TYPE);
    
            if (type != AssociationType.HAS_MEMBER) {
                validateDocumentRelationship(association, docEntryIds);
            }
            else {
                validateAssociation(association, docEntryIds, profile);
            }
        }
    }

    private void validateAssociation(EbXMLAssociation association, Set<String> docEntryIds, ValidationProfile profile) throws XDSMetaDataException {
        List<String> slotValues = association.getSlotValues(SLOT_NAME_SUBMISSION_SET_STATUS);
        if (!slotValues.isEmpty()) {
            metaDataAssert(slotValues.size() == 1, TOO_MANY_SUBMISSION_SET_STATES);
            
            AssociationLabel status = AssociationLabel.fromOpcode(slotValues.get(0));
            metaDataAssert(status != null, INVALID_SUBMISSION_SET_STATUS);
    
            if (status == AssociationLabel.ORIGINAL && !profile.isQuery()) {
                metaDataAssert(docEntryIds.contains(association.getTarget()), MISSING_ORIGINAL);
            }
        }
    }

    private void validateDocumentRelationship(EbXMLAssociation association, Set<String> docEntryIds)throws XDSMetaDataException {
        metaDataAssert(docEntryIds.contains(association.getSource()), SOURCE_UUID_NOT_FOUND); 
    }
}