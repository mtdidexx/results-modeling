package com.idexx.lims.v4;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.Unit;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class SampleUnit {
    private Sample sample;
    private Unit unit;
    private List<IntervalResult> results;

    SampleUnit(Sample sample, Unit unit) {
        this.sample = sample;
        this.unit = unit;
        this.results = new ArrayList<>();
    }

    SampleUnit addResul(IntervalResult result) {
        results.add(result);
        return this;
    }

    public Sample getSample() {
        return sample;
    }

    public Unit getUnit() {
        return unit;
    }

    public List<IntervalResult> getResults() {
        return results;
    }

    public SampleUnit addResult(@NotNull Animal animal, IntervalResult interval) {
        return this;
    }
}
