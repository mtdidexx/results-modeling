package com.idexx.lims.v1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Assay {
    private String code;
    @NotNull
    private List<Result> results = new ArrayList<>();

    public Assay(String code) {
        this.code = code;
    }

    @NotNull
    public Assay addResult(Result result) {
        results.add(result);
        return this;
    }

    public String getCode() {
        return code;
    }

    @NotNull
    public List<Result> getResults() {
        return results;
    }
}
