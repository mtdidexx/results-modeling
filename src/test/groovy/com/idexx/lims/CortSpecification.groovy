package com.idexx.lims

import spock.lang.Specification

class CortSpecification extends Specification {
    def "CORT basic setup"() {
        given:
        def cort = new Assay("CORT")
        when:
        cort.addResult(new IntervalResult("Central EU",
                Animal.canine(),
                new Sample("EDTA_WHOLE_BLOOD"),
                new BigDecimal("0.9"),
                new BigDecimal("4.5"),
                Unit.UG_DL))
        cort.addResult(new IntervalResult("Central EU",
                new Animal("CANINE"),
                new Sample("EDTA_PLASMA"),
                BigDecimal.valueOf(0.9),
                BigDecimal.valueOf(4.5),
                Unit.UG_DL))
        then:
        cort.results.size() == 2
    }
}