package com.idexx.lims;

import org.jetbrains.annotations.NotNull;

public class Animal {
    private String code;

    public Animal(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @NotNull
    public static Animal canine() {
        return new Animal("CANINE");
    }

    @NotNull
    public static Animal feline() {
        return new Animal("FELINE");
    }

    @NotNull
    public static Animal equine() {
        return new Animal("EQUINE");
    }

    @NotNull
    public static Animal bovine() {
        return new Animal("BOVINE");
    }
}
