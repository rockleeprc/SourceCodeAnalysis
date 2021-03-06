/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.chart;

/**
Builder class for javafx.scene.chart.NumberAxis
@see javafx.scene.chart.NumberAxis
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class NumberAxisBuilder extends javafx.scene.chart.ValueAxisBuilder<java.lang.Number, javafx.scene.chart.NumberAxisBuilder> {
    protected NumberAxisBuilder() {
    }

    /** Creates a new instance of NumberAxisBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.chart.NumberAxisBuilder create() {
        return new javafx.scene.chart.NumberAxisBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.chart.NumberAxis x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setForceZeroInRange(this.forceZeroInRange);
        if ((set & (1 << 1)) != 0) x.setTickUnit(this.tickUnit);
    }

    private boolean forceZeroInRange;
    /**
    Set the value of the {@link javafx.scene.chart.NumberAxis#isForceZeroInRange() forceZeroInRange} property for the instance constructed by this builder.
    */
    public javafx.scene.chart.NumberAxisBuilder forceZeroInRange(boolean x) {
        this.forceZeroInRange = x;
        __set |= 1 << 0;
        return this;
    }

    private double tickUnit;
    /**
    Set the value of the {@link javafx.scene.chart.NumberAxis#getTickUnit() tickUnit} property for the instance constructed by this builder.
    */
    public javafx.scene.chart.NumberAxisBuilder tickUnit(double x) {
        this.tickUnit = x;
        __set |= 1 << 1;
        return this;
    }

    /**
    Make an instance of {@link javafx.scene.chart.NumberAxis} based on the properties set on this builder.
    */
    public javafx.scene.chart.NumberAxis build() {
        javafx.scene.chart.NumberAxis x = new javafx.scene.chart.NumberAxis();
        applyTo(x);
        return x;
    }
}
