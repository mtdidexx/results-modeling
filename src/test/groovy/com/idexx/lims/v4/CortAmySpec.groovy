package com.idexx.lims.v4

import com.idexx.lims.Animal
import com.idexx.lims.Sample
import com.idexx.lims.enums.Unit
import spock.lang.Specification

class CortAmySpec extends Specification {

    def "CORT Setup"() {
        given:
        def cort = new Assay("CORT")

        when:
        cort.addGroup("Central EU")
                .addSample(Sample.edtaWholeBlood(), Unit.UG_DL)
                .addResult(Animal.canine(), new IntervalResult(new BigDecimal(0.9), new BigDecimal(4.5)))

        then:
        cort.groups.size() == 1
        cort.groups*.key == ['Central EU']
    }
}
