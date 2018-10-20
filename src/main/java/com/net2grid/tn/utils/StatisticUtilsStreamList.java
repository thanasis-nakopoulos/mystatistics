package com.net2grid.tn.utils;

import java.util.List;

/**
 * Provides a list of statistical metric for a List of double values, using Streams.
 * Moreover it provides the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Standard deviation <br>
 *     5) Median value
 * @author Thanasis Nakopoulos
 */
public class StatisticUtilsStreamList extends StatisticUtilsStream {

    /**
     * Constructor does nothing
     */
    public StatisticUtilsStreamList() {
    }

    /**
     * Calculates the minimim value for a List
     * @param values A List of double values for which to calculate the minimum value
     * @return the minimum value of the input List
     */
    public double calcMin(List<Double> values) {
        return calcMin(values.stream().mapToDouble(Double::doubleValue));
    }

    /**
     * Calculates the maximum value for a List
     * @param values A List of double values for which to calculate the maximum value
     * @return the maximum value of the input List
     */
    public double calcMax(List<Double> values) {
        return calcMax(values.stream().mapToDouble(Double::doubleValue));
    }

    /**
     * Calculates the mean value for a List
     * @param values A List of double values for which to calculate the mean value
     * @return the mean value of the input List
     */
    public double calcMean(List<Double> values) {
        return calcMean(values.stream().mapToDouble(Double::doubleValue));
    }

    /**
     * Calculates the median value for a List
     * @param values A List of double values for which to calculate the median value
     * @return the median value of the input List
     */
    public double calcMedian(List<Double> values) {
        return calcMedian(values.stream().mapToDouble(Double::doubleValue),values.size());
    }

    /**
     * Calculates the standard deviation for a List
     * @param values A List of double values for which to calculate the standard deviation
     * @return the standard deviation of the input List
     */
    public double calcStde(List<Double> values) {
        return calcStde(values.stream().mapToDouble(Double::doubleValue),values.size(),calcMean(values));
    }
}
