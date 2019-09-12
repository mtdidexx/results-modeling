package com.idexx.lims.v1;

import com.idexx.lims.enums.ResultReferenceType;
import com.idexx.lims.enums.Unit;

class Result {
    private String group;
    private ResultReferenceType resultType;
    private Unit units;

    Result(String group, ResultReferenceType resultType, Unit units) {
        this.group = group;
        this.resultType = resultType;
        this.units = units;
    }

    public String getGroup() {
        return group;
    }

    public ResultReferenceType getResultType() {
        return resultType;
    }

    public Unit getUnits() {
        return units;
    }
}
