package com.idexx.lims.v2

import com.idexx.lims.Animal
import com.idexx.lims.Sample
import com.idexx.lims.enums.InequalitySign
import com.idexx.lims.enums.Unit
import spock.lang.Specification

class IntervalThresholdSpec extends Specification {
    def "CORT with 1 group"() {
        given:
        def cort = new Assay("CORT")

        when:
        cort.addGroup("clab").addInterval(Animal.canine(), Sample.separatedSerum(), 0.9, 4.5, Unit.UG_DL)
        .addInterval(Animal.canine(), Sample.edtaWholeBlood(), 0.9, 4.5, Unit.UG_DL)
        .addInterval(Animal.canine(), Sample.separatedSerum1(), 0.9, 4.5, Unit.UG_DL)
        .addInterval(Animal.feline(), Sample.separatedSerum(), 0.5, 5.4, Unit.UG_DL)
        .addInterval(Animal.feline(), Sample.separatedSerum1(), 0.5, 5.4, Unit.UG_DL)
        .addInterval(Animal.equine(), Sample.separatedSerum(), 2.9, 9.1, Unit.UG_DL)
        .addInterval(Animal.equine(), Sample.separatedSerum1(), 2.9, 9.1, Unit.UG_DL)
        .addInterval(Animal.bovine(), Sample.separatedSerum(), 0.2, 0.54, Unit.UG_DL)

        then:
        cort.getGroup("clab").isPresent()
        cort.getGroup("clab").get().resultReferenceList.size() == 8
    }

    def "CORT with two groups"() {
        given:
        def cort = new Assay("CORT")

        when:
        cort.addGroup("Clab")
        cort.addGroup("UK")

        then:
        cort.groups.size() == 2
    }

    def "AMY with one group"() {
        given:
        def amy = new Assay("AMY")

        when:
        amy.addGroup("clab").addThreshold(new Animal("ALPACA"), Sample.separatedSerum(), InequalitySign.LESS_THAN, 1800.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.canine(), Sample.edtaWholeBlood(), 333.toBigDecimal(), 1264.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.canine(), Sample.separatedSerum(), 333.toBigDecimal(), 1264.toBigDecimal(), Unit.U_L)
        .addInterval(new Animal("RABBIT"), Sample.separatedSerum(), 166.toBigDecimal(), 314.toBigDecimal(), Unit.U_L)
        .addThreshold(Animal.feline(), Sample.edtaWholeBlood(), InequalitySign.LESS_THAN, 2041.toBigDecimal(), Unit.U_L)
        .addThreshold(Animal.feline(), Sample.separatedSerum(), InequalitySign.LESS_THAN, 2041.toBigDecimal(), Unit.U_L)
        .addThreshold(new Animal("LLAMA"), Sample.separatedSerum(), InequalitySign.LESS_THAN, 1880.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.equine(), Sample.separatedSerum(), 0.toBigDecimal(), 400.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.equine(), Sample.edtaWholeBlood(), 0.toBigDecimal(), 400.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.bovine(), Sample.edtaWholeBlood(), 40.toBigDecimal(), 161.toBigDecimal(), Unit.U_L)
        .addInterval(Animal.bovine(), Sample.separatedSerum(), 40.toBigDecimal(), 161.toBigDecimal(), Unit.U_L)

        then:
        amy.groups[0].resultReferenceList.size() == 11
    }
}
