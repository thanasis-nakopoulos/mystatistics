package com.net2grid.tn.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the StatisticUtilsArray Class
 */
@DisplayName("Statistic Utils Array Test")
class StatisticUtilsArrayTest {

    private double[] inputData = new double[]{10.0,20.0,100.0,40.0,30.0};
    private StatisticUtilsArray sua;

    /**
     * Initialize the state before each scenario
     */
    @BeforeEach
    void setUp() {
        sua = new StatisticUtilsArray(inputData);
    }

    /**
     * Tests the minimum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Min=10.0
     */
    @Test
    void testMin() {
        assertEquals(10.0,sua.calcMin());
    }

    /**
     * Tests the maximum calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Max=100.0
     */
    @Test
    void testMax() {
        assertEquals(100.0,sua.calcMax());
    }

    /**
     * Tests the median calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Median=30.0
     */
    @Test
    void testMedian() {
        assertEquals(30.0,sua.calcMedian());
    }

    /**
     * Tests the mean calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Mean=40.0
     */
    @Test
    void testMean() {
        assertEquals(40.0,sua.calcMean());
    }

    /**
     * Tests the standard deviation calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Stde=31.622776601683793
     */
    @Test
    void testStde() {
        assertEquals(31.622776601683793, sua.calcStde());
    }

    /**
     * Tests the setData function
     * New Input=[1.0,2.0,3.0,10.0,4.0]
     * New Expected Min=1.0
     * New Expected Max=10.0
     */
    @Test
    void testSetData() {
        double[] newInput = new double[] {1.0,2.0,3.0,10.0,4.0};
        sua.setData(newInput);
        assertEquals(10.0,sua.calcMax());
        assertEquals(1.0,sua.calcMin());
    }

    /**
     * Test the calcMin if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMinIfEmptyInput() {
        double[] newInput = new double[]{};
        sua.setData(newInput);
        assertEquals(Double.NaN,sua.calcMin());
    }

    /**
     * Test the calcMax if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMaxIfEmptyInput() {
        double[] newInput = new double[]{};
        sua.setData(newInput);
        assertEquals(Double.NaN,sua.calcMax());
    }

    /**
     * Test the calcMean if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMeanIfEmptyInput() {
        double[] newInput = new double[]{};
        sua.setData(newInput);
        assertEquals(Double.NaN,sua.calcMean());
    }

    /**
     * Test the calcMedian if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testMedianIfEmptyInput() {
        double[] newInput = new double[]{};
        sua.setData(newInput);
        assertEquals(Double.NaN,sua.calcMedian());
    }

    /**
     * Test the calcStde if input is empty
     * Input = Empty Array
     * Expected = NaN
     */
    @Test
    void testStdeIfEmptyInput() {
        double[] newInput = new double[]{};
        sua.setData(newInput);
        assertEquals(Double.NaN,sua.calcStde());
    }
}
