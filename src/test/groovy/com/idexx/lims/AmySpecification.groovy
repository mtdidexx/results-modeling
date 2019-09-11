package com.idexx.lims

import spock.lang.Specification

// AMY has both intervals and thresholds
class AmySpecification extends Specification {
    def clab = "Clab"

    def "AMY Basic Setup"() {
        given:
        def amy = new Assay("AMY")
        when:
        amy.addResult(new ThresholdResult(
                clab,
                Unit.U_L,
                InequalitySign.LESS_THAN,
                new BigDecimal(1800),
                new Animal("ALPACA"),
                new Sample("SEPARATED_SERUM")))
        amy.addResult(new IntervalResult(clab,
                Animal.canine(),
                new Sample("EDTA_WHOLE_BLOOD"),
                new BigDecimal(333),
                new BigDecimal(1264),
                Unit.U_L
        ))
        amy.addResult(new IntervalResult(clab,
                Animal.canine(),
                new Sample("SEPARATED_SERUM"),
                new BigDecimal(333),
                new BigDecimal(1264),
                Unit.U_L
        ))
        amy.addResult(new IntervalResult(clab,
                new Animal("RABBIT"),
                new Sample("SEPARATED_SERUM"),
                new BigDecimal(166),
                new BigDecimal(314),
                Unit.U_L
        ))
        amy.addResult(new ThresholdResult(clab, Unit.U_L, InequalitySign.LESS_THAN, new BigDecimal(2041), Animal.feline(), new Sample("EDTA_WHOLE_BLOOD")))
        amy.addResult(new ThresholdResult(clab,
                Unit.U_L,
                InequalitySign.LESS_THAN,
                new BigDecimal(2041),
                Animal.feline(),
                new Sample("SEPARATED_SERUM")))
        amy.addResult(new ThresholdResult(clab, Unit.U_L, InequalitySign.LESS_THAN, new BigDecimal(1800), new Animal("LLAMA"), new Sample("SEPARATED_SERUM")))

        amy.addResult(new IntervalResult(clab, new Animal("EQUINE"), new Sample("EDTA_WHOLE_BLOOD"), new BigDecimal(0), new BigDecimal(400), Unit.U_L))
        amy.addResult(new IntervalResult(clab, new Animal("EQUINE"), new Sample("SEPARATED_SERUM"), new BigDecimal(0), new BigDecimal(400), Unit.U_L))
        amy.addResult(new IntervalResult(clab, new Animal("BOVINE"), new Sample("EDTA_WHOLE_BLOOD"), new BigDecimal(40), new BigDecimal(161), Unit.U_L))
        amy.addResult(new IntervalResult(clab, new Animal("BOVINE"), new Sample("SEPARATED_SERUM"), new BigDecimal(40), new BigDecimal(161), Unit.U_L))

        then:
        amy.results.size() == 11
    }

}
