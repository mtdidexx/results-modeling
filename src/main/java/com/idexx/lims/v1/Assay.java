package com.idexx.lims.v1;

import java.util.ArrayList;
import java.util.List;

class Assay {
    private String code;
    private List<Result> results = new ArrayList<>();

    public Assay(String code) {
        this.code = code;
    }

    public Assay addResult(Result result) {
        results.add(result);
        return this;
    }

    public String getCode() {
        return code;
    }

    public List<Result> getResults() {
        return results;
    }
}
