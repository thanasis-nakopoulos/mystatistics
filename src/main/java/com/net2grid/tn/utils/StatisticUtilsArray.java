package com.net2grid.tn.utils;

import com.google.common.math.Quantiles;
import com.google.common.math.Stats;

/**
 * Provides a set of statistical values for an array of double values.
 * Moreover it provides the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Median value <br>
 *     5) Standard deviation
 * @author Thanasis Nakopoulos
 */
public class StatisticUtilsArray extends StatisticUtils
{
    private double[] values;

    /**
     * Constructor which initializes the dataset
     * @param values An array of double values to initialize the dataset
     */
    public StatisticUtilsArray(double[] values) {
        super(values);
        setValues(values);
    }

    /**
     * Sets the dataset
     * @param values An array of double values to initialize the dataset
     */
    private void setValues(double[] values) {
        this.values=values;
    }

    /**
     * Sets the current dataset
     * @param values An array of double values to initialize the dataset
     */
    public void setData(double[] values) {
        setValues(values);
        setState(Stats.of(values));
    }

    /**
     * Calculates and returns the Median value of the current dataset
     * @return The Median value of the current dataset or NaN for an empty dataset
     */
    public double calcMedian() { return values.length != 0? Quantiles.median().compute(values): Double.NaN; }
}
