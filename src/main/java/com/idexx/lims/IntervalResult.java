package com.idexx.lims;

import java.math.BigDecimal;

public class IntervalResult extends Result {
    private Animal animal;
    private Sex sex;
    private Sample sample;
    private Age age;
    private BigDecimal criticalLow;
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal criticalHigh;

    public IntervalResult(String group,
                          Unit units,
                          Animal animal,
                          Sex sex,
                          Sample sample,
                          BigDecimal low,
                          BigDecimal high) {
        super(group, ResultReferenceType.INTERVAL, units);
        this.animal = animal;
        this.sex = sex;
        this.sample = sample;
        this.low = low;
        this.high = high;
    }

    public IntervalResult(String group, Animal animal, Sample sample, BigDecimal low, BigDecimal high, Unit units) {
        super(group, ResultReferenceType.INTERVAL, units);
        this.animal = animal;
        this.sample = sample;
        this.low = low;
        this.high = high;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Sex getSex() {
        return sex;
    }

    public Sample getSample() {
        return sample;
    }

    public Age getAge() {
        return age;
    }

    public BigDecimal getCriticalLow() {
        return criticalLow;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getCriticalHigh() {
        return criticalHigh;
    }
}
