package eu.europa.ec.grow.espd.domain.ubl;

import java.util.List;

/**
 * Specific condition that the Economic Operator has to fulfill in order to be considered
 * as a candidate in a procurement process.
 * <p/>
 * Created by vigi on 11/17/15:4:16 PM.
 */
public interface CcvCriterion {

    String getUuid();

    String getTypeCode();

    String getName();

    String getDescription();

    CcvLegislation getLegislation();

    List<? extends CcvRequirementGroup> getGroups();

    CcvCriterionType getCriterionType();

    /**
     * The name of the field in the ESPD model to which the criterion maps.
     *
     * @return
     */
    String getEspdDocumentField();
}