package com.net2grid.tn.utils;

import java.util.stream.DoubleStream;

/**
 * Provides a list of statistical metrics for an array of double values, using Streams.
 * Moreover it provides the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Standard deviation <br>
 *     5) Median value
 * @author Thanasis Nakopoulos
 */
public class StatisticUtilsStreamArray extends StatisticUtilsStream {

    /**
     * Constructor does nothing
     */
    public StatisticUtilsStreamArray() {
    }

    /**
     * Calculates the minimim value for an array
     * @param values An array for which to calculate the minimum value
     * @return the minimum value of the input array
     */
    public double calcMin(double[] values) {
        return calcMin(DoubleStream.of(values));
    }

    /**
     * Calculates the maximum value for an array
     * @param values An array for which to calculate the maximum value
     * @return the maximum value of the input array
     */
    public double calcMax(double[] values) {
        return calcMax(DoubleStream.of(values));
    }

    /**
     * Calculates the mean value for an array
     * @param values An array for which to calculate the mean value
     * @return the mean value of the input array
     */
    public double calcMean(double[] values) {
        return calcMean(DoubleStream.of(values));
    }

    /**
     * Calculates the median value for an array
     * @param values An array for which to calculate the median value
     * @return the median value of the input array
     */
    public double calcMedian(double[] values) {
        return calcMedian(DoubleStream.of(values),values.length);
    }

    /**
     * Calculates the standard deviation for an array
     * @param values An array for which to calculate the standard deviation
     * @return the standard deviation of the input array
     */
    public double calcStde(double[] values) {
        return calcStde(DoubleStream.of(values),values.length,calcMean(values));
    }
}
