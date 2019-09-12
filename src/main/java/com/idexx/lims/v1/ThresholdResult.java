package com.idexx.lims.v1;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.Age;
import com.idexx.lims.enums.InequalitySign;
import com.idexx.lims.enums.ResultReferenceType;
import com.idexx.lims.enums.Unit;

import java.math.BigDecimal;

class ThresholdResult extends Result {
    private InequalitySign sign;
    private BigDecimal value;

    //
    private Animal animal;
    private Sample sample;
    // age is almost never specified, so move it out of the main use case
    private Age age;

    public ThresholdResult(String group, BigDecimal value, Unit units, InequalitySign sign, Animal animal, Sample sample, Age age) {
        super(group, ResultReferenceType.THRESHOLD, units);
        this.value = value;
        this.animal = animal;
        this.sample = sample;
        this.sign = sign;
        this.age = age;
    }

    public ThresholdResult(String group, Unit units, InequalitySign sign, BigDecimal value, Animal animal, Sample sample) {
        super(group, ResultReferenceType.THRESHOLD, units);
        this.sign = sign;
        this.value = value;
        this.animal = animal;
        this.sample = sample;
    }

    public InequalitySign getSign() {
        return sign;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Sample getSample() {
        return sample;
    }

    public Age getAge() {
        return age;
    }
}
