package com.net2grid.tn.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the StatisticUtilsArrayList class when the input ArrayList is of type Double
 */
@DisplayName("Statistic Utils ArrayList Double Test")
class StatisticUtilsArrayListDoubleTest{

    private ArrayList<Double> inputArrayList;
    private StatisticUtilsArrayList sual;

    /**
     * Initializes the input data before each test
     * Input=[10.0,20.0,100.0,40.0,30.0]
     */
    @BeforeEach
    void setUp() {
        inputArrayList = new ArrayList<>();
        inputArrayList.add(10.0);
        inputArrayList.add(20.0);
        inputArrayList.add(100.0);
        inputArrayList.add(40.0);
        inputArrayList.add(30.0);
        sual = new StatisticUtilsArrayList(inputArrayList);
    }

    /**
     * Tests the minimum value calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Min=10.0
     */
    @Test
    void testMinDouble() {
        assertEquals(10.0,sual.calcMin());
    }

    /**
     * Tests the maximum value calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Max=100.0
     */
    @Test
    void testMaxDouble() {
        assertEquals(100.0,sual.calcMax());
    }

    /**
     * Tests the median value calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Median=30.0
     */
    @Test
    void testMedianDouble() {
        assertEquals(30.0,sual.calcMedian());
    }

    /**
     * Tests the mean value calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Expected Mean=40.0
     */
    @Test
    void testMeanDouble() {
        assertEquals(40.0,sual.calcMean());
    }

    /**
     * Tests the standard deviation calculation
     * Input=[10.0,20.0,100.0,40.0,30.0]
     * Standard Deviation=31.622776601683793
     */
    @Test
    void testStdeDouble() {
        assertEquals(31.622776601683793, sual.calcStde());
    }

    /**
     * Tests the setData function
     * New Input=[1.0,2.0,3.0,10.0,4.0]
     * New Expected Min=1.0
     * New Expected Max=10.0
     */
    @Test
    void testSetDataDouble() {
        ArrayList<Double> newInput = new ArrayList<>();
        newInput.add(1.0);
        newInput.add(2.0);
        newInput.add(10.0);
        newInput.add(4.0);
        newInput.add(3.0);
        sual.setData(newInput);
        assertEquals(10.0,sual.calcMax());
        assertEquals(1.0,sual.calcMin());
    }

    /**
     * Tests the calcMin if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMinDoubleListEmpty() {
        ArrayList<Double> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMin());
    }

    /**
     * Tests the calcMax if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMaxDoubleListEmpty() {
        ArrayList<Double> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMax());
    }

    /**
     * Tests the calcMean if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMeanDoubleListEmpty() {
        ArrayList<Double> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMean());
    }

    /**
     * Tests the calcMedian if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMedianDoubleListEmpty() {
        ArrayList<Double> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMedian());
    }

    /**
     * Tests the calcStde if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testStdeDoubleListEmpty() {
        ArrayList<Double> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcStde());
    }
}
