package com.net2grid.tn.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the StatisticUtilsStreamArray Class
 */
@DisplayName("Statistic Utils Stream Array Test")
class StatisticUtilsStreamArrayTest {

    private double[] inputData = new double[]{10.0,20.0,100.0,40.0,30.0};
    private StatisticUtilsStreamArray susa = new StatisticUtilsStreamArray();

    /**
     * Tests the minimum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Min=10.0
     */
    @Test
    void testMin() {
        assertEquals(10.0,susa.calcMin(inputData));
    }

    /**
     * Tests the maximum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Max=100.0
     */
    @Test
    void testMax() {
        assertEquals(100.0,susa.calcMax(inputData));
    }

    /**
     * Tests the median calculation when there are odd elements in the stream
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Median=30.0
     */
    @Test
    void testMedianOddCount() {
        assertEquals(30.0,susa.calcMedian(inputData));
    }

    /**
     * Tests the median calculation when there are even elements in the stream
     * Input=[10.0,20.0,100.0,40.0,30.0,35.0]
     * Expected Median=32.5
     */
    @Test
    void testMedianEvenCount() {
        inputData = new double[] {10.0,20.0,100.0,40.0,30.0,35.0};
        assertEquals(32.5,susa.calcMedian(inputData));
    }

    /**
     * Tests the mean calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Mean=40.0
     */
    @Test
    void testMean() {
        assertEquals(40.0,susa.calcMean(inputData));
    }

    /**
     * Tests the standard deviation calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Stde=31.622776601683793
     */
    @Test
    void testStde() {
        assertEquals(31.622776601683793, susa.calcStde(inputData));
    }

    /**
     * Test the calcMin if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMinIfEmptyInput() {
        double[] newInput = new double[]{};
        assertEquals(Double.NaN,susa.calcMin(newInput));
    }

    /**
     * Test the calcMax if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMaxIfEmptyInput() {
        double[] newInput = new double[]{};
        assertEquals(Double.NaN,susa.calcMax(newInput));
    }

    /**
     * Test the calcMean if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMeanIfEmptyInput() {
        double[] newInput = new double[]{};
        assertEquals(Double.NaN,susa.calcMean(newInput));
    }

    /**
     * Test the calcMedian if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMedianIfEmptyInput() {
        double[] newInput = new double[]{};
        assertEquals(Double.NaN,susa.calcMedian(newInput));
    }

    /**
     * Test the calcStde if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testStdeIfEmptyInput() {
        double[] newInput = new double[]{};
        assertEquals(Double.NaN,susa.calcStde(newInput));
    }
}
