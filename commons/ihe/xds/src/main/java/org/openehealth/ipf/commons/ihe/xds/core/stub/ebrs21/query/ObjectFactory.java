//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.query;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rim.RegistryObjectListType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openehealth.ipf.platform.camel.ihe.commons.stub.ebrs21.query package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ServiceFilter");
    private final static QName _RegistryObjectQueryResult_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryObjectQueryResult");
    private final static QName _OrganizationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "OrganizationQuery");
    private final static QName _ClassificationNodeQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationNodeQuery");
    private final static QName _ExternalIdentifierFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ExternalIdentifierFilter");
    private final static QName _TelephoneNumberFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "TelephoneNumberFilter");
    private final static QName _IntClause_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "IntClause");
    private final static QName _EmailAddressFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "EmailAddressFilter");
    private final static QName _LocalizedStringFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "LocalizedStringFilter");
    private final static QName _ClassificationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationQuery");
    private final static QName _ClassificationSchemeQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationSchemeQuery");
    private final static QName _ExtrinsicObjectFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ExtrinsicObjectFilter");
    private final static QName _RegistryEntryFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryEntryFilter");
    private final static QName _ServiceQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ServiceQuery");
    private final static QName _UserFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "UserFilter");
    private final static QName _AuditableEventFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "AuditableEventFilter");
    private final static QName _ClassificationFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationFilter");
    private final static QName _ServiceBindingTargetBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ServiceBindingTargetBranch");
    private final static QName _SQLQueryResult_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SQLQueryResult");
    private final static QName _ResponseOption_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ResponseOption");
    private final static QName _AuditableEventQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "AuditableEventQuery");
    private final static QName _ClassificationNodeFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationNodeFilter");
    private final static QName _ServiceBindingFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ServiceBindingFilter");
    private final static QName _OrganizationChildrenBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "OrganizationChildrenBranch");
    private final static QName _DateTimeClause_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "DateTimeClause");
    private final static QName _ServiceBindingBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ServiceBindingBranch");
    private final static QName _FloatClause_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "FloatClause");
    private final static QName _PostalAddressFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "PostalAddressFilter");
    private final static QName _AssociationFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "AssociationFilter");
    private final static QName _SourceAssociationBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SourceAssociationBranch");
    private final static QName _SlotValueFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SlotValueFilter");
    private final static QName _TargetAssociationBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "TargetAssociationBranch");
    private final static QName _ClassificationSchemeFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationSchemeFilter");
    private final static QName _AssociationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "AssociationQuery");
    private final static QName _ExternalLinkFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ExternalLinkFilter");
    private final static QName _SlotFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SlotFilter");
    private final static QName _RegistryObjectQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryObjectQuery");
    private final static QName _OrganizationFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "OrganizationFilter");
    private final static QName _RegistryObjectFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryObjectFilter");
    private final static QName _ClassificationNodeChildrenBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationNodeChildrenBranch");
    private final static QName _OrganizationParentBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "OrganizationParentBranch");
    private final static QName _SQLQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SQLQuery");
    private final static QName _NameBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "NameBranch");
    private final static QName _SpecificationLinkFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "SpecificationLinkFilter");
    private final static QName _ClassificationNodeParentBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ClassificationNodeParentBranch");
    private final static QName _RegistryPackageFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryPackageFilter");
    private final static QName _RegistryEntryQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryEntryQuery");
    private final static QName _ExtrinsicObjectQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "ExtrinsicObjectQuery");
    private final static QName _DescriptionBranch_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "DescriptionBranch");
    private final static QName _RegistryPackageQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", "RegistryPackageQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openehealth.ipf.platform.camel.ihe.commons.stub.ebrs21.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClassificationQueryResult }
     * 
     */
    public ClassificationQueryResult createClassificationQueryResult() {
        return new ClassificationQueryResult();
    }

    /**
     * Create an instance of {@link ExtrinsicObjectQueryType }
     * 
     */
    public ExtrinsicObjectQueryType createExtrinsicObjectQueryType() {
        return new ExtrinsicObjectQueryType();
    }

    /**
     * Create an instance of {@link ExtrinsicObjectQueryResult }
     * 
     */
    public ExtrinsicObjectQueryResult createExtrinsicObjectQueryResult() {
        return new ExtrinsicObjectQueryResult();
    }

    /**
     * Create an instance of {@link Clause }
     * 
     */
    public Clause createClause() {
        return new Clause();
    }

    /**
     * Create an instance of {@link OrganizationQueryType }
     * 
     */
    public OrganizationQueryType createOrganizationQueryType() {
        return new OrganizationQueryType();
    }

    /**
     * Create an instance of {@link OrganizationQueryResult }
     * 
     */
    public OrganizationQueryResult createOrganizationQueryResult() {
        return new OrganizationQueryResult();
    }

    /**
     * Create an instance of {@link RegistryPackageQueryResult }
     * 
     */
    public RegistryPackageQueryResult createRegistryPackageQueryResult() {
        return new RegistryPackageQueryResult();
    }

    /**
     * Create an instance of {@link FilterQuery }
     * 
     */
    public FilterQuery createFilterQuery() {
        return new FilterQuery();
    }

    /**
     * Create an instance of {@link ClassificationNodeQueryType }
     * 
     */
    public ClassificationNodeQueryType createClassificationNodeQueryType() {
        return new ClassificationNodeQueryType();
    }

    /**
     * Create an instance of {@link SpecificationLinkBranch }
     * 
     */
    public SpecificationLinkBranch createSpecificationLinkBranch() {
        return new SpecificationLinkBranch();
    }

    /**
     * Create an instance of {@link AuditableEventQueryType }
     * 
     */
    public AuditableEventQueryType createAuditableEventQueryType() {
        return new AuditableEventQueryType();
    }

    /**
     * Create an instance of {@link AssociationQueryType }
     * 
     */
    public AssociationQueryType createAssociationQueryType() {
        return new AssociationQueryType();
    }

    /**
     * Create an instance of {@link AssociationQueryResult }
     * 
     */
    public AssociationQueryResult createAssociationQueryResult() {
        return new AssociationQueryResult();
    }

    /**
     * Create an instance of {@link FilterQueryResult }
     * 
     */
    public FilterQueryResult createFilterQueryResult() {
        return new FilterQueryResult();
    }

    /**
     * Create an instance of {@link ServiceQueryType }
     * 
     */
    public ServiceQueryType createServiceQueryType() {
        return new ServiceQueryType();
    }

    /**
     * Create an instance of {@link SimpleClause }
     * 
     */
    public SimpleClause createSimpleClause() {
        return new SimpleClause();
    }

    /**
     * Create an instance of {@link AuditableEventQueryResult }
     * 
     */
    public AuditableEventQueryResult createAuditableEventQueryResult() {
        return new AuditableEventQueryResult();
    }

    /**
     * Create an instance of {@link StringClause }
     * 
     */
    public StringClause createStringClause() {
        return new StringClause();
    }

    /**
     * Create an instance of {@link ServiceBindingBranchType }
     * 
     */
    public ServiceBindingBranchType createServiceBindingBranchType() {
        return new ServiceBindingBranchType();
    }

    /**
     * Create an instance of {@link AdhocQueryRequest }
     * 
     */
    public AdhocQueryRequest createAdhocQueryRequest() {
        return new AdhocQueryRequest();
    }

    /**
     * Create an instance of {@link RationalClause }
     * 
     */
    public RationalClause createRationalClause() {
        return new RationalClause();
    }

    /**
     * Create an instance of {@link ClassifiedByBranch }
     * 
     */
    public ClassifiedByBranch createClassifiedByBranch() {
        return new ClassifiedByBranch();
    }

    /**
     * Create an instance of {@link AssociationBranchType }
     * 
     */
    public AssociationBranchType createAssociationBranchType() {
        return new AssociationBranchType();
    }

    /**
     * Create an instance of {@link GetContentResponse }
     * 
     */
    public GetContentResponse createGetContentResponse() {
        return new GetContentResponse();
    }

    /**
     * Create an instance of {@link GetContentRequest }
     * 
     */
    public GetContentRequest createGetContentRequest() {
        return new GetContentRequest();
    }

    /**
     * Create an instance of {@link SlotBranch }
     * 
     */
    public SlotBranch createSlotBranch() {
        return new SlotBranch();
    }

    /**
     * Create an instance of {@link ClassificationSchemeQueryResult }
     * 
     */
    public ClassificationSchemeQueryResult createClassificationSchemeQueryResult() {
        return new ClassificationSchemeQueryResult();
    }

    /**
     * Create an instance of {@link BooleanClause }
     * 
     */
    public BooleanClause createBooleanClause() {
        return new BooleanClause();
    }

    /**
     * Create an instance of {@link ClassificationNodeQueryResult }
     * 
     */
    public ClassificationNodeQueryResult createClassificationNodeQueryResult() {
        return new ClassificationNodeQueryResult();
    }

    /**
     * Create an instance of {@link RegistryPackageQueryType }
     * 
     */
    public RegistryPackageQueryType createRegistryPackageQueryType() {
        return new RegistryPackageQueryType();
    }

    /**
     * Create an instance of {@link RegistryObjectQueryType }
     * 
     */
    public RegistryObjectQueryType createRegistryObjectQueryType() {
        return new RegistryObjectQueryType();
    }

    /**
     * Create an instance of {@link InternationalStringBranchType }
     * 
     */
    public InternationalStringBranchType createInternationalStringBranchType() {
        return new InternationalStringBranchType();
    }

    /**
     * Create an instance of {@link UserBranch }
     * 
     */
    public UserBranch createUserBranch() {
        return new UserBranch();
    }

    /**
     * Create an instance of {@link CompoundClause }
     * 
     */
    public CompoundClause createCompoundClause() {
        return new CompoundClause();
    }

    /**
     * Create an instance of {@link ClassificationSchemeQueryType }
     * 
     */
    public ClassificationSchemeQueryType createClassificationSchemeQueryType() {
        return new ClassificationSchemeQueryType();
    }

    /**
     * Create an instance of {@link ServiceQueryResult }
     * 
     */
    public ServiceQueryResult createServiceQueryResult() {
        return new ServiceQueryResult();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link RegistryEntryQueryType }
     * 
     */
    public RegistryEntryQueryType createRegistryEntryQueryType() {
        return new RegistryEntryQueryType();
    }

    /**
     * Create an instance of {@link ClassificationQueryType }
     * 
     */
    public ClassificationQueryType createClassificationQueryType() {
        return new ClassificationQueryType();
    }

    /**
     * Create an instance of {@link AdhocQueryResponse }
     * 
     */
    public AdhocQueryResponse createAdhocQueryResponse() {
        return new AdhocQueryResponse();
    }

    /**
     * Create an instance of {@link ResponseOptionType }
     * 
     */
    public ResponseOptionType createResponseOptionType() {
        return new ResponseOptionType();
    }

    /**
     * Create an instance of {@link RegistryEntryQueryResult }
     * 
     */
    public RegistryEntryQueryResult createRegistryEntryQueryResult() {
        return new RegistryEntryQueryResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ServiceFilter")
    public JAXBElement<FilterType> createServiceFilter(FilterType value) {
        return new JAXBElement<>(_ServiceFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryObjectListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryObjectQueryResult")
    public JAXBElement<RegistryObjectListType> createRegistryObjectQueryResult(RegistryObjectListType value) {
        return new JAXBElement<>(_RegistryObjectQueryResult_QNAME, RegistryObjectListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "OrganizationQuery")
    public JAXBElement<OrganizationQueryType> createOrganizationQuery(OrganizationQueryType value) {
        return new JAXBElement<>(_OrganizationQuery_QNAME, OrganizationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationNodeQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationNodeQuery")
    public JAXBElement<ClassificationNodeQueryType> createClassificationNodeQuery(ClassificationNodeQueryType value) {
        return new JAXBElement<>(_ClassificationNodeQuery_QNAME, ClassificationNodeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ExternalIdentifierFilter")
    public JAXBElement<FilterType> createExternalIdentifierFilter(FilterType value) {
        return new JAXBElement<>(_ExternalIdentifierFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "TelephoneNumberFilter")
    public JAXBElement<FilterType> createTelephoneNumberFilter(FilterType value) {
        return new JAXBElement<>(_TelephoneNumberFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "IntClause")
    public JAXBElement<BigInteger> createIntClause(BigInteger value) {
        return new JAXBElement<>(_IntClause_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "EmailAddressFilter")
    public JAXBElement<FilterType> createEmailAddressFilter(FilterType value) {
        return new JAXBElement<>(_EmailAddressFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "LocalizedStringFilter")
    public JAXBElement<FilterType> createLocalizedStringFilter(FilterType value) {
        return new JAXBElement<>(_LocalizedStringFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationQuery")
    public JAXBElement<ClassificationQueryType> createClassificationQuery(ClassificationQueryType value) {
        return new JAXBElement<>(_ClassificationQuery_QNAME, ClassificationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationSchemeQuery")
    public JAXBElement<ClassificationSchemeQueryType> createClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        return new JAXBElement<>(_ClassificationSchemeQuery_QNAME, ClassificationSchemeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ExtrinsicObjectFilter")
    public JAXBElement<FilterType> createExtrinsicObjectFilter(FilterType value) {
        return new JAXBElement<>(_ExtrinsicObjectFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryEntryFilter")
    public JAXBElement<FilterType> createRegistryEntryFilter(FilterType value) {
        return new JAXBElement<>(_RegistryEntryFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ServiceQuery")
    public JAXBElement<ServiceQueryType> createServiceQuery(ServiceQueryType value) {
        return new JAXBElement<>(_ServiceQuery_QNAME, ServiceQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "UserFilter")
    public JAXBElement<FilterType> createUserFilter(FilterType value) {
        return new JAXBElement<>(_UserFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "AuditableEventFilter")
    public JAXBElement<FilterType> createAuditableEventFilter(FilterType value) {
        return new JAXBElement<>(_AuditableEventFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationFilter")
    public JAXBElement<FilterType> createClassificationFilter(FilterType value) {
        return new JAXBElement<>(_ClassificationFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceBindingBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ServiceBindingTargetBranch")
    public JAXBElement<ServiceBindingBranchType> createServiceBindingTargetBranch(ServiceBindingBranchType value) {
        return new JAXBElement<>(_ServiceBindingTargetBranch_QNAME, ServiceBindingBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryObjectListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SQLQueryResult")
    public JAXBElement<RegistryObjectListType> createSQLQueryResult(RegistryObjectListType value) {
        return new JAXBElement<>(_SQLQueryResult_QNAME, RegistryObjectListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseOptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ResponseOption")
    public JAXBElement<ResponseOptionType> createResponseOption(ResponseOptionType value) {
        return new JAXBElement<>(_ResponseOption_QNAME, ResponseOptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditableEventQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "AuditableEventQuery")
    public JAXBElement<AuditableEventQueryType> createAuditableEventQuery(AuditableEventQueryType value) {
        return new JAXBElement<>(_AuditableEventQuery_QNAME, AuditableEventQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationNodeFilter")
    public JAXBElement<FilterType> createClassificationNodeFilter(FilterType value) {
        return new JAXBElement<>(_ClassificationNodeFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ServiceBindingFilter")
    public JAXBElement<FilterType> createServiceBindingFilter(FilterType value) {
        return new JAXBElement<>(_ServiceBindingFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "OrganizationChildrenBranch")
    public JAXBElement<OrganizationQueryType> createOrganizationChildrenBranch(OrganizationQueryType value) {
        return new JAXBElement<>(_OrganizationChildrenBranch_QNAME, OrganizationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "DateTimeClause")
    public JAXBElement<XMLGregorianCalendar> createDateTimeClause(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DateTimeClause_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceBindingBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ServiceBindingBranch")
    public JAXBElement<ServiceBindingBranchType> createServiceBindingBranch(ServiceBindingBranchType value) {
        return new JAXBElement<>(_ServiceBindingBranch_QNAME, ServiceBindingBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "FloatClause")
    public JAXBElement<Float> createFloatClause(Float value) {
        return new JAXBElement<>(_FloatClause_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "PostalAddressFilter")
    public JAXBElement<FilterType> createPostalAddressFilter(FilterType value) {
        return new JAXBElement<>(_PostalAddressFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "AssociationFilter")
    public JAXBElement<FilterType> createAssociationFilter(FilterType value) {
        return new JAXBElement<>(_AssociationFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SourceAssociationBranch")
    public JAXBElement<AssociationBranchType> createSourceAssociationBranch(AssociationBranchType value) {
        return new JAXBElement<>(_SourceAssociationBranch_QNAME, AssociationBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SlotValueFilter")
    public JAXBElement<FilterType> createSlotValueFilter(FilterType value) {
        return new JAXBElement<>(_SlotValueFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "TargetAssociationBranch")
    public JAXBElement<AssociationBranchType> createTargetAssociationBranch(AssociationBranchType value) {
        return new JAXBElement<>(_TargetAssociationBranch_QNAME, AssociationBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationSchemeFilter")
    public JAXBElement<FilterType> createClassificationSchemeFilter(FilterType value) {
        return new JAXBElement<>(_ClassificationSchemeFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "AssociationQuery")
    public JAXBElement<AssociationQueryType> createAssociationQuery(AssociationQueryType value) {
        return new JAXBElement<>(_AssociationQuery_QNAME, AssociationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ExternalLinkFilter")
    public JAXBElement<FilterType> createExternalLinkFilter(FilterType value) {
        return new JAXBElement<>(_ExternalLinkFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SlotFilter")
    public JAXBElement<FilterType> createSlotFilter(FilterType value) {
        return new JAXBElement<>(_SlotFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryObjectQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryObjectQuery")
    public JAXBElement<RegistryObjectQueryType> createRegistryObjectQuery(RegistryObjectQueryType value) {
        return new JAXBElement<>(_RegistryObjectQuery_QNAME, RegistryObjectQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "OrganizationFilter")
    public JAXBElement<FilterType> createOrganizationFilter(FilterType value) {
        return new JAXBElement<>(_OrganizationFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryObjectFilter")
    public JAXBElement<FilterType> createRegistryObjectFilter(FilterType value) {
        return new JAXBElement<>(_RegistryObjectFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationNodeQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationNodeChildrenBranch")
    public JAXBElement<ClassificationNodeQueryType> createClassificationNodeChildrenBranch(ClassificationNodeQueryType value) {
        return new JAXBElement<>(_ClassificationNodeChildrenBranch_QNAME, ClassificationNodeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "OrganizationParentBranch")
    public JAXBElement<OrganizationQueryType> createOrganizationParentBranch(OrganizationQueryType value) {
        return new JAXBElement<>(_OrganizationParentBranch_QNAME, OrganizationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SQLQuery")
    public JAXBElement<String> createSQLQuery(String value) {
        return new JAXBElement<>(_SQLQuery_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "NameBranch")
    public JAXBElement<InternationalStringBranchType> createNameBranch(InternationalStringBranchType value) {
        return new JAXBElement<>(_NameBranch_QNAME, InternationalStringBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "SpecificationLinkFilter")
    public JAXBElement<FilterType> createSpecificationLinkFilter(FilterType value) {
        return new JAXBElement<>(_SpecificationLinkFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationNodeQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ClassificationNodeParentBranch")
    public JAXBElement<ClassificationNodeQueryType> createClassificationNodeParentBranch(ClassificationNodeQueryType value) {
        return new JAXBElement<>(_ClassificationNodeParentBranch_QNAME, ClassificationNodeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryPackageFilter")
    public JAXBElement<FilterType> createRegistryPackageFilter(FilterType value) {
        return new JAXBElement<>(_RegistryPackageFilter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryEntryQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryEntryQuery")
    public JAXBElement<RegistryEntryQueryType> createRegistryEntryQuery(RegistryEntryQueryType value) {
        return new JAXBElement<>(_RegistryEntryQuery_QNAME, RegistryEntryQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtrinsicObjectQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "ExtrinsicObjectQuery")
    public JAXBElement<ExtrinsicObjectQueryType> createExtrinsicObjectQuery(ExtrinsicObjectQueryType value) {
        return new JAXBElement<>(_ExtrinsicObjectQuery_QNAME, ExtrinsicObjectQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalStringBranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "DescriptionBranch")
    public JAXBElement<InternationalStringBranchType> createDescriptionBranch(InternationalStringBranchType value) {
        return new JAXBElement<>(_DescriptionBranch_QNAME, InternationalStringBranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryPackageQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1", name = "RegistryPackageQuery")
    public JAXBElement<RegistryPackageQueryType> createRegistryPackageQuery(RegistryPackageQueryType value) {
        return new JAXBElement<>(_RegistryPackageQuery_QNAME, RegistryPackageQueryType.class, null, value);
    }

}
