package com.net2grid.tn.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the StatisticUtilsArrayList class when the input ArrayList is of type Integer
 */
@DisplayName("Statistic Utils ArrayList Integer Test")
class StatisticUtilsArrayListIntegerTest{

    private ArrayList<Integer> inputData;
    private StatisticUtilsArrayList sual;

    /**
     * Initializes the input data before each test
     * Input=[10,20,100,40,30]
     */
    @BeforeEach
    void setUp() {
        inputData = new ArrayList<>();
        inputData.add(10);
        inputData.add(20);
        inputData.add(100);
        inputData.add(40);
        inputData.add(30);
        sual = new StatisticUtilsArrayList(inputData);
    }

    /**
     * Tests the minimum value calculation
     * Input=[10,20,100,40,30]
     * Expected Min=10.0
     */
    @Test
    void testMinInteger() {
        assertEquals(10.0,sual.calcMin());
    }

    /**
     * Tests the maximum value calculation
     * Input=[10,20,100,40,30]
     * Expected Max=100.0
     */
    @Test
    void testMaxInteger() {
        assertEquals(100.0,sual.calcMax());
    }

    /**
     * Tests the median value calculation
     * Input=[10,20,100,40,30]
     * Expected Median=30.0
     */
    @Test
    void testMedianInteger() {
        assertEquals(30.0,sual.calcMedian());
    }

    /**
     * Tests the mean value calculation
     * Input=[10,20,100,40,30]
     * Expected Mean=40.0
     */
    @Test
    void testMeanInteger() {
        assertEquals(40.0,sual.calcMean());
    }

    /**
     * Tests the standard deviation calculation
     * Input=[10,20,100,40,30]
     * Standard Deviation=31.622776601683793
     */
    @Test
    void testStdeInteger() {
        assertEquals(31.622776601683793, sual.calcStde());
    }

    /**
     * Tests the setData function
     * New Input=[1,2,3,10,4]
     * New Expected Min=1.0
     * New Expected Max=10.0
     */
    @Test
    void testSetDataInteger() {
        ArrayList<Integer> newInput = new ArrayList<>();
        newInput.add(1);
        newInput.add(2);
        newInput.add(10);
        newInput.add(4);
        newInput.add(3);
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
    void testMinIntegerListEmpty() {
        ArrayList<Integer> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMin());
    }

    /**
     * Tests the calcMax if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMaxIntegerListEmpty() {
        ArrayList<Integer> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMax());
    }

    /**
     * Tests the calcMean if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMeanIntegerListEmpty() {
        ArrayList<Integer> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMean());
    }

    /**
     * Tests the calcMedian if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testMedianIntegerListEmpty() {
        ArrayList<Integer> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcMedian());
    }

    /**
     * Tests the calcStde if input list is empty
     * Input = Empty List
     * Expected = NaN
     */
    @Test
    void testStdeIntegerListEmpty() {
        ArrayList<Integer> newInput = new ArrayList<>();
        sual.setData(newInput);
        assertEquals(Double.NaN,sual.calcStde());
    }
}
