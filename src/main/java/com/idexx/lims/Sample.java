package com.idexx.lims;

public class Sample {
    private String code;

    public Sample(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // just for convenience in this probe
    public static Sample separatedSerum() {
        return new Sample("SEPARATED_SERUM");
    }

    public static Sample separatedSerum1() {
        return new Sample("SEPARATED_SERUM_1");
    }

    public static Sample edtaWholeBlood() {
        return new Sample("EDTA_WHOLE_BLOOD");
    }
}
