package com.idexx.lims;

public class Animal {
    private String code;

    public Animal(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Animal canine() {
        return new Animal("CANINE");
    }

    public static Animal feline() {
        return new Animal("FELINE");
    }
}
