package com.idexx.lims.v2;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.InequalitySign;
import com.idexx.lims.enums.Unit;

import java.math.BigDecimal;

class ThresholdResult extends ResultReference {
    private InequalitySign inequalitySign;
    private BigDecimal threshold;
    private Unit unit;

    ThresholdResult(Animal animal, Sample sample, InequalitySign inequalitySign, BigDecimal threshold, Unit unit) {
        super(sample, animal);
        this.inequalitySign = inequalitySign;
        this.threshold = threshold;
        this.unit = unit;
    }

    public InequalitySign getInequalitySign() {
        return inequalitySign;
    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public Unit getUnit() {
        return unit;
    }
}
