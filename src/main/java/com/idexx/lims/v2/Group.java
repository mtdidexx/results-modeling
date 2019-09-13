package com.idexx.lims.v2;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.InequalitySign;
import com.idexx.lims.enums.Unit;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Group {
    private String code;
    @NotNull
    private List<ResultReference> resultReferenceList = new ArrayList<>();

    Group(String code) {
        this.code = code;
    }

    String getCode() {
        return code;
    }

    @NotNull List<ResultReference> getResultReferenceList() {
        return resultReferenceList;
    }

    @NotNull Group addInterval(Animal animal, Sample sample, BigDecimal lowValue, BigDecimal highValue, Unit unit) {
        resultReferenceList.add(new IntervalResult(sample, animal, lowValue, highValue, unit));
        return this;
    }

    @NotNull
    public Group addThreshold(Animal animal, Sample sample, InequalitySign inequalitySign, BigDecimal threshold, Unit unit) {
        resultReferenceList.add(new ThresholdResult(animal, sample, inequalitySign, threshold, unit));
        return this;
    }
}
