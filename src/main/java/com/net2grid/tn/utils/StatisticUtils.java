package com.net2grid.tn.utils;

import com.google.common.math.Stats;

import java.util.ArrayList;
/**
 * An abstract class which provides a set of statistical values.
 * Moreover it provides the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Standard deviation <br>
 *     5) Median value
 * @author Thanasis Nakopoulos
 */
abstract class StatisticUtils {

    private Stats state;

    /**
     * Constructor to initialize the state and set the dataset equals to the provided double array
     * @param values An array with double values to initialize the state
     */
    public StatisticUtils(double[] values) {
        setState(Stats.of(values));
    }

    /**
     * Constructor to initialize the state and set the dataset equals to the provided arraylist
     * @param values An arraylist with any Numerical type to initialize the state
     */
    public <N extends Number> StatisticUtils(ArrayList<N> values) {
        setState(Stats.of(values));
    }

    /**
     * Calculates and returns the Minimum value of the current dataset
     * @return The Minimum value of the current dataset or NaN for an empty dataset
     */
    public double calcMin() { return state.count() != 0? state.min(): Double.NaN; }

    /**
     * Calculates and returns the Maximum value of the current dataset
     * @return The Maximum value of the current dataset or NaN for an empty dataset
     */
    public double calcMax() { return state.count() != 0? state.max(): Double.NaN; }

    /**
     * Calculates and returns the Mean value of the current dataset
     * @return The Mean value of the current dataset or NaN for an empty dataset
     */
    public double calcMean() { return state.count() != 0? state.mean(): Double.NaN; }

    /**
     * Calculates and returns the Standard Deviation of the current dataset
     * @return The Standard Deviation of the current dataset or NaN for an empty dataset
     */
    public double calcStde() { return state.count() !=0? state.populationStandardDeviation(): Double.NaN; }

    /**
     * Sets the Stats object
     * @param state a States object which contains a state of data
     */
    protected void setState(Stats state) {
        this.state = state;
    }
}
