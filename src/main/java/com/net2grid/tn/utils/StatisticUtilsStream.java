package com.net2grid.tn.utils;

import java.util.stream.DoubleStream;

/**
 * An abstract class which calculates a set of statistical values using Streams
 * Moreover it calculates the following metrics: <br>
 *     1) Minimum value <br>
 *     2) Maximum value <br>
 *     3) Mean value <br>
 *     4) Standard deviation <br>
 *     5) Median value
 * @author Thanasis Nakopoulos
 */
abstract class StatisticUtilsStream {

    /**
     * Constructor does nothing
     */
    public StatisticUtilsStream() {
    }

    /**
     * Calculates the minimum value of a stream
     * @param stream A stream containing data for estimating the minimum value
     * @return the minimum value of the input stream or NaN for an empty dataset
     */
    protected double calcMin(DoubleStream stream) {
        return stream.min().orElse(Double.NaN);
    }

    /**
     * Calculates the maximum value of a stream
     * @param stream A stream containing data for estimating the maximum value
     * @return the maximum value of the input stream or NaN for an empty dataset
     */
    protected double calcMax(DoubleStream stream) {
        return stream.max().orElse(Double.NaN);
    }

    /**
     * Calculates the mean value of a stream
     * @param stream A stream containing data for estimating the mean value
     * @return the mean value of the input stream or NaN for an empty dataset
     */
    protected double calcMean(DoubleStream stream) {
        return stream.average().orElse(Double.NaN);
    }

    /**
     * Calculates the median value of a stream
     * @param stream A stream containing data for estimating the median value
     * @param count Number of elements in the stream
     * @return the median value of the input stream or NaN for an empty dataset
     */
    protected double calcMedian(DoubleStream stream, long count) {
        double median = Double.NaN;
        // if list is odd, get the middle element, else get the average of the two middle elements
        if (count != 0) {
            median = count % 2 == 0 ?
                    stream.sorted().skip((count / 2) - 1).limit(2).average().orElse(Double.NaN) :
                    stream.sorted().skip(count / 2).findFirst().orElse(Double.NaN);
        }
        return median;
    }

    /**
     * Calculates the standard deviation of a stream
     * @param stream A stream containing data for estimating the standard deviation
     * @param count Number of elements in the stream
     * @param mean The mean value of the stream
     * @return the minimum value of the input stream or NaN for an empty dataset
     */
    protected double calcStde(DoubleStream stream, long count, double mean) {
        return count != 0?
                java.lang.Math.sqrt(stream.map(n -> java.lang.Math.pow(java.lang.Math.abs(n-mean),2.0)).sum() / count):
                Double.NaN;
    }

}
