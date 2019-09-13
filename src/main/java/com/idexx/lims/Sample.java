package com.idexx.lims;

import org.jetbrains.annotations.NotNull;

public class Sample {
    private String code;

    public Sample(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // just for convenience in this probe
    @NotNull
    public static Sample separatedSerum() {
        return new Sample("SEPARATED_SERUM");
    }

    @NotNull
    public static Sample separatedSerum1() {
        return new Sample("SEPARATED_SERUM_1");
    }

    @NotNull
    public static Sample edtaWholeBlood() {
        return new Sample("EDTA_WHOLE_BLOOD");
    }
}
