package com.idexx.lims.v4

class IntervalResult {
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal criticalLow;
    private BigDecimal criticalHigh;

    IntervalResult(BigDecimal low, BigDecimal high) {
        this.low = low;
        this.high = high;
    }

    IntervalResult(BigDecimal low, BigDecimal high, BigDecimal criticalLow, BigDecimal criticalHigh) {
        this.low = low
        this.high = high
        this.criticalLow = criticalLow
        this.criticalHigh = criticalHigh
    }

    BigDecimal getLow() {
        return low
    }

    BigDecimal getHigh() {
        return high
    }

    BigDecimal getCriticalLow() {
        return criticalLow
    }

    BigDecimal getCriticalHigh() {
        return criticalHigh
    }
}
