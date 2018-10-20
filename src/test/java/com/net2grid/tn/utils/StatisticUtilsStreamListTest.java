package com.net2grid.tn.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the StatisticUtilsStreamList Class
 */
@DisplayName("Statistic Utils Stream List Test")
class StatisticUtilsStreamListTest {

    private List<Double> inputData = Arrays.asList(10.0,20.0,100.0,40.0,30.0);
    private StatisticUtilsStreamList susl = new StatisticUtilsStreamList();

    /**
     * Tests the minimum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Min=10.0
     */
    @Test
    void testMin() {
        assertEquals(10.0,susl.calcMin(inputData));
    }

    /**
     * Tests the maximum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Max=100.0
     */
    @Test
    void testMax() {
        assertEquals(100.0,susl.calcMax(inputData));
    }

    /**
     * Tests the median calculation when there are odd elements in the stream
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Median=30.0
     */
    @Test
    void testMedianOddCount() {
        assertEquals(30.0,susl.calcMedian(inputData));
    }

    /**
     * Tests the median calculation when there are even elements in the stream
     * Input=[10.0,20.0,100.0,40.0,30.0,35.0]
     * Expected Median=32.5
     */
    @Test
    void testMedianEvenCount() {
        inputData = Arrays.asList(10.0,20.0,100.0,40.0,30.0,35.0);
        assertEquals(32.5,susl.calcMedian(inputData));
    }

    /**
     * Tests the mean calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Mean=40.0
     */
    @Test
    void testMean() {
        assertEquals(40.0,susl.calcMean(inputData));
    }

    /**
     * Tests the standard deviation calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Stde=31.622776601683793
     */
    @Test
    void testStde() {
        assertEquals(31.622776601683793, susl.calcStde(inputData));
    }

    /**
     * Test the calcMin if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMinIfEmptyInput() {
        inputData = new ArrayList<>();
        assertEquals(Double.NaN,susl.calcMin(inputData));
    }

    /**
     * Test the calcMax if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMaxIfEmptyInput() {
        inputData = new ArrayList<>();
        assertEquals(Double.NaN,susl.calcMax(inputData));
    }

    /**
     * Test the calcMean if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMeanIfEmptyInput() {
        inputData = new ArrayList<>();
        assertEquals(Double.NaN,susl.calcMean(inputData));
    }

    /**
     * Test the calcMedian if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMedianIfEmptyInput() {
        inputData = new ArrayList<>();
        assertEquals(Double.NaN,susl.calcMedian(inputData));
    }

    /**
     * Test the calcStde if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testStdeIfEmptyInput() {
        inputData = new ArrayList<>();
        assertEquals(Double.NaN,susl.calcStde(inputData));
    }
}
