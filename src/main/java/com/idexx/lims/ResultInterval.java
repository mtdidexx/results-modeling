package com.idexx.lims;

import java.math.BigDecimal;

public class ResultInterval {
    private BigDecimal low;
    private BigDecimal high;
    // not needed for Central EU, but will be needed for other areas
    private BigDecimal criticalHigh;
    private BigDecimal criticalLow;

    public ResultInterval(BigDecimal low, BigDecimal high) {
        this.low = low;
        this.high = high;
    }

    public ResultInterval(BigDecimal low, BigDecimal high, BigDecimal criticalHigh, BigDecimal criticalLow) {
        this.low = low;
        this.high = high;
        this.criticalHigh = criticalHigh;
        this.criticalLow = criticalLow;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getCriticalHigh() {
        return criticalHigh;
    }

    public BigDecimal getCriticalLow() {
        return criticalLow;
    }
}
