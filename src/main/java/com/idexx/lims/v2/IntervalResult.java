package com.idexx.lims.v2;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.Age;
import com.idexx.lims.enums.Sex;
import com.idexx.lims.enums.Unit;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

class IntervalResult extends ResultReference {
    private BigDecimal lowValue;
    private BigDecimal highValue;
    private Unit unit;

    // criticals not used in Central EU
    @Nullable
    private BigDecimal criticalLow;
    @Nullable
    private BigDecimal criticalHigh;

    IntervalResult(Sample sample, Animal animal, BigDecimal lowValue, BigDecimal highValue, Unit unit) {
        super(sample, animal);
        this.lowValue = lowValue;
        this.highValue = highValue;
        this.unit = unit;
    }

    @SuppressWarnings("unused")
    IntervalResult(Sample sample, Animal animal, @Nullable Sex sex, @Nullable Age age, BigDecimal lowValue, BigDecimal highValue, Unit unit, @Nullable BigDecimal criticalLow, @Nullable BigDecimal criticalHigh) {
        super(sample, animal, sex, age);
        this.lowValue = lowValue;
        this.highValue = highValue;
        this.unit = unit;
        this.criticalLow = criticalLow;
        this.criticalHigh = criticalHigh;
    }

    public BigDecimal getLowValue() {
        return lowValue;
    }

    public BigDecimal getHighValue() {
        return highValue;
    }

    public Unit getUnit() {
        return unit;
    }

    @Nullable
    public BigDecimal getCriticalLow() {
        return criticalLow;
    }

    @Nullable
    public BigDecimal getCriticalHigh() {
        return criticalHigh;
    }
}
