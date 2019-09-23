package com.idexx.lims.v4;

import com.idexx.lims.Sample;
import com.idexx.lims.enums.Unit;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Group {
    private String key;
    private List<SampleUnit> sampleUnits = new ArrayList<>();

    Group(String key) {
        this.key = key;
    }

    String getKey() {
        return key;
    }

    public SampleUnit addSample(@NotNull Sample sample, Unit unit) {
        SampleUnit sampleUnit = new SampleUnit(sample, unit);
        sampleUnits.add(sampleUnit);
        return sampleUnit;
    }

    public List<SampleUnit> getSampleUnits() {
        return sampleUnits;
    }
}
