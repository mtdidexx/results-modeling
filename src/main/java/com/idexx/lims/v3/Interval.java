package com.idexx.lims.v3;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.Age;
import com.idexx.lims.enums.Sex;
import com.idexx.lims.enums.Unit;

import java.math.BigDecimal;

class Interval extends ClinicalRelevance {
    private Animal animal;
    private Sex sex;
    private Sample sample;
    private Age age;

    private BigDecimal criticalLow;
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal criticalHigh;
    private Unit unit;

    public Interval(Group group, Animal animal, Sex sex, Sample sample, Age age, BigDecimal criticalLow, BigDecimal low, BigDecimal high, BigDecimal criticalHigh, Unit unit) {
        super(group);
        this.animal = animal;
        this.sex = sex;
        this.sample = sample;
        this.age = age;
        this.criticalLow = criticalLow;
        this.low = low;
        this.high = high;
        this.criticalHigh = criticalHigh;
        this.unit = unit;
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

    public Unit getUnit() {
        return unit;
    }
}
