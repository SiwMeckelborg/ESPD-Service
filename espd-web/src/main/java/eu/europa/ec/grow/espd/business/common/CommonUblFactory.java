package eu.europa.ec.grow.espd.business.common;

import eu.europa.ec.grow.espd.constants.enums.Agency;
import eu.europa.ec.grow.espd.domain.EspdDocument;
import grow.names.specification.ubl.schema.xsd.espdrequest_1.ESPDRequestType;
import grow.names.specification.ubl.schema.xsd.espdresponse_1.ESPDResponseType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AttachmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExternalReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Simple factory for creating simple UBL elements that are shared between a {@link ESPDRequestType}
 * and {@link ESPDResponseType}.
 * <p/>
 * Created by ratoico on 11/26/15.
 */
@Component
public class CommonUblFactory {

    public enum EspdType {
        ESPD_REQUEST,
        ESPD_RESPONSE
    }

    /**
     * Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements
     * that might be encountered in the current instance.
     *
     * @return The corresponding UBL element
     */
    public UBLVersionIDType buildUblVersionIDType() {
        UBLVersionIDType versionIDType = new UBLVersionIDType();
        versionIDType.setValue("2.1");
        versionIDType.setSchemeAgencyID("OASIS-UBL-TC");
        return versionIDType;
    }

    /**
     * Identifies a user-defined customization of UBL for a specific use.
     *
     * @param espdType If it's about a ESPD Request or Response
     *
     * @return The corresponding UBL element
     */
    public CustomizationIDType buildCustomizationIDType(EspdType espdType) {
        CustomizationIDType customizationIDType = new CustomizationIDType();
        if (EspdType.ESPD_REQUEST.equals(espdType)) {
            customizationIDType.setValue("urn:www.cenbii.eu:transaction:biitrns070:ver3.0");
        } else if (EspdType.ESPD_RESPONSE.equals(espdType)) {
            customizationIDType.setValue("urn:www.cenbii.eu:transaction:biitrns092:ver3.0");
        }
        customizationIDType.setSchemeAgencyID("BII");
        customizationIDType.setSchemeVersionID("3.0");
        customizationIDType.setSchemeName("CustomizationID");
        return customizationIDType;
    }

    /**
     * Identifier of a document. A transaction instance must contain an identifier.
     * The identifier enables positive referencing the document instance for various purposes
     * including referencing between transactions that are part of the same process.
     *
     * @return The corresponding UBL element
     */
    public IDType buildIdType() {
        IDType idType = new IDType();
        idType.setValue(UUID.randomUUID().toString());
        idType.setSchemeAgencyID(Agency.EU_COM_GROW.getIdentifier());
        idType.setSchemeAgencyName(Agency.EU_COM_GROW.getLongName());
        idType.setSchemeVersionID("1.1");
        idType.setSchemeID("ISO/IEC 9834-8:2008 - 4UUID");
        return idType;
    }

    /**
     * Indicates whether this document is a copy (true) or not (false).
     *
     * @param isCopy If the document is a copy or not
     *
     * @return The corresponding UBL element
     */
    public CopyIndicatorType buildCopyIndicatorType(boolean isCopy) {
        CopyIndicatorType copyIndicatorType = new CopyIndicatorType();
        copyIndicatorType.setValue(isCopy);
        return copyIndicatorType;
    }

    /**
     * The version of the document that has been identified with the document identifier.
     *
     * @return The corresponding UBL element
     */
    public VersionIDType buildVersionIDType() {
        VersionIDType versionIDType = new VersionIDType();
        versionIDType.setValue("1");
        versionIDType.setSchemeAgencyID(Agency.EU_COM_GROW.getIdentifier());
        return versionIDType;
    }

    /**
     * Date when the referred document was issued.
     *
     * @param when The desired date
     * @return The corresponding UBL element
     */
    public IssueDateType buildIssueDateType(Date when) {
        IssueDateType issueDateType = new IssueDateType();
        issueDateType.setValue(new LocalDate(when));
        return issueDateType;
    }

    /**
     * Time when the document was issued.
     *
     * @param when The desired time
     * @return The corresponding UBL element
     */
    public IssueTimeType buildIssueTimeType(Date when) {
        IssueTimeType issueTimeType = new IssueTimeType();
        issueTimeType.setValue(new LocalTime(when));
        return issueTimeType;
    }

    public ContractFolderIDType buildContractFolderType(String fileReferenceNumber) {
        ContractFolderIDType contractFolderIDType = new ContractFolderIDType();
        contractFolderIDType.setValue(fileReferenceNumber);
        contractFolderIDType.setSchemeAgencyID("TeD");
        return contractFolderIDType;
    }

    /**
     * Reference to the Contract Notice in TeD.
     * <p></p>
     * For procurement projects above the threshold it is compulsory to specify the following data,
     * by means of an AdditionalDocumentReference element, about the Contract Notice published in TeD:
     * the OJEU S number[], date[], page[], Notice number in OJS: YYYY/S [][][]-[][][][][][],
     * Title and Description of the Procurement Project
     *
     * @param espdDocument
     */
    public DocumentReferenceType buildProcurementProcedureType(EspdDocument espdDocument) {
        DocumentReferenceType documentReferenceType = new DocumentReferenceType();
        IDType idType = new IDType();
        idType.setSchemeID("ISO/IEC 9834-8:2008 - 4UUID");
        idType.setSchemeAgencyID(Agency.EU_COM_GROW.getIdentifier());
        idType.setSchemeAgencyName(Agency.EU_COM_GROW.getLongName());
        idType.setSchemeVersionID("1.1");
        idType.setValue(espdDocument.getOjsNumber());
        documentReferenceType.setID(idType);

        // A reference to a Contract Notice published in the TeD platform (European Commission, Office of Publications).
        DocumentTypeCodeType documentTypeCode = new DocumentTypeCodeType();
        documentTypeCode.setListAgencyID(Agency.EU_COM_GROW.getIdentifier());
        documentTypeCode.setListID("ReferencesTypeCodes");
        documentTypeCode.setListVersionID("1.0");
        documentTypeCode.setValue("TeD_CN");
        documentReferenceType.setDocumentTypeCode(documentTypeCode);

        AttachmentType attachmentType = new AttachmentType();
        ExternalReferenceType externalReferenceType = new ExternalReferenceType();

        FileNameType fileNameType = new FileNameType();
        fileNameType.setValue(espdDocument.getProcedureTitle());
        externalReferenceType.setFileName(fileNameType);

        DescriptionType descriptionType = new DescriptionType();
        descriptionType.setValue(espdDocument.getProcedureShortDesc());
        externalReferenceType.getDescription().add(descriptionType);

        attachmentType.setExternalReference(externalReferenceType);
        documentReferenceType.setAttachment(attachmentType);

        return documentReferenceType;
    }
}
