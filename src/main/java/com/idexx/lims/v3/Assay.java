package com.idexx.lims.v3;

import java.util.ArrayList;
import java.util.List;

class Assay {
    private String code;
    private List<ClinicalRelevance> clinicallyRelevant = new ArrayList<>();

    public Assay(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Assay addClinicallyRelevant(ClinicalRelevance result) {
        clinicallyRelevant.add(result);
        return this;
    }

    public List<ClinicalRelevance> getClinicallyRelevant() {
        return clinicallyRelevant;
    }
}
