package com.net2grid.tn.utils;

import com.google.common.math.Quantiles;
import com.google.common.math.Stats;

import java.util.ArrayList;

/**
 * Provides a set of statistical values for an arrayList of any Numerical Data type.
 * Moreover it provides the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Median value <br>
 *     5) Standard deviation
 * @param <N> Numerical Data Type
 * @author Thanasis Nakopoulos
 */
public class  StatisticUtilsArrayList <N extends Number> extends StatisticUtils {

    private ArrayList<N> values;

    /**
     * Constructor which initializes the dataset
     * @param values An arrayList of any Numerical Data type to initialize the dataset
     */
    public StatisticUtilsArrayList(ArrayList<N> values) {
        super(values);
        setValues(values);
    }

    /**
     * Sets the dataset
     * @param values An arraylist of any Numerical type values to initialize the dataset
     */
    private void setValues(ArrayList<N> values) { this.values = values; }

    /**
     * Sets the current dataset
     * @param values An array of double values to initialize the dataset
     */
    public void setData(ArrayList<N> values) {
        setValues(values);
        setState(Stats.of(values));
    }

    /**
     * Calculates and returns the Median value of the current dataset
     * @return The Median value of the current dataset or NaN for an empty dataset
     */
    public double calcMedian() { return values.size() != 0? Quantiles.median().compute(values): Double.NaN; }

}
