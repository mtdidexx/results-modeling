package com.idexx.lims.v2;

import com.idexx.lims.Animal;
import com.idexx.lims.Sample;
import com.idexx.lims.enums.Age;
import com.idexx.lims.enums.Sex;
import org.jetbrains.annotations.Nullable;

class ResultReference {
    private Sample sample;
    private Animal animal;
    @Nullable
    private Sex sex;
    @Nullable
    private Age age;

    ResultReference(Sample sample, Animal animal) {
        this.sample = sample;
        this.animal = animal;
    }

    ResultReference(Sample sample, Animal animal, @Nullable Sex sex, @Nullable Age age) {
        this.sample = sample;
        this.animal = animal;
        this.sex = sex;
        this.age = age;
    }

    Sample getSample() {
        return sample;
    }

    Animal getAnimal() {
        return animal;
    }

    @Nullable Sex getSex() {
        return sex;
    }

    @Nullable Age getAge() {
        return age;
    }
}
