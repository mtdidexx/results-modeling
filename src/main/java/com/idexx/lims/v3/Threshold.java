package com.idexx.lims.v3;

import com.idexx.lims.enums.InequalitySign;

import java.math.BigDecimal;

class Threshold extends ClinicalRelevance {
    private BigDecimal thresholdValue;
    private InequalitySign operator;

    public Threshold(Group group, BigDecimal thresholdValue, InequalitySign operator) {
        super(group);
        this.thresholdValue = thresholdValue;
        this.operator = operator;
    }

    public BigDecimal getThresholdValue() {
        return thresholdValue;
    }

    public InequalitySign getOperator() {
        return operator;
    }
}
