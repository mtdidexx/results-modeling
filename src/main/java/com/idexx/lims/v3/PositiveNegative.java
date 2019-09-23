package com.idexx.lims.v3;

import com.idexx.lims.enums.PositiveNegativeValue;

class PositiveNegative extends ClinicalRelevance {
    private PositiveNegativeValue normalValue;

    public PositiveNegative(Group group, PositiveNegativeValue normalValue) {
        super(group);
        this.normalValue = normalValue;
    }

    public PositiveNegativeValue getNormalValue() {
        return normalValue;
    }
}
