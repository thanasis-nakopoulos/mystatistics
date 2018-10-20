package com.net2grid.tn.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the AscendingMinima Class
 */
@DisplayName("Ascendind Minima Test")
public class  AscendingMinimaTest{

    private AscendingMinima am = new AscendingMinima();
    private List<Double> inputData;
    private List<Double> calculatedAscendingMinima;
    private List<Double> expectedAscendingMinima;

    /**
     * Tests that when the input list to the calcAscendingMinima is empty, then the return value will be empty as well
     */
    @Test
    void testEmptyInputList(){
        inputData = new ArrayList<>();
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(true, calculatedAscendingMinima.isEmpty());
    }

    /**
     * Tests the ascending minima when all the input data are equal
     * Input=[3.0,3.0,3.0,3.0]
     * AscendingMinima=[3.0]
     */
    @Test
    void testEqualAllInputData() {
        inputData = Arrays.asList(3.0,3.0,3.0,3.0);
        expectedAscendingMinima = Arrays.asList(3.0);
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(expectedAscendingMinima, calculatedAscendingMinima);
    }

    /**
     * Tests the ascending minima when there are negative input
     * Input=[5.3,10.1,-1.0,-2.0,1.0,-0.5,0.0,3.3,2.9,3.3]
     * AscendingMinima=[-2.0,-0.5,0.0,2.9,3.3]
     */
    @Test
    void testNegativeInput() {
        inputData=Arrays.asList(5.3,10.1,-1.0,-2.0,1.0,-0.5,0.0,3.3,2.9,3.3);
        expectedAscendingMinima=Arrays.asList(-2.0,-0.5,0.0,2.9,3.3);
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(expectedAscendingMinima, calculatedAscendingMinima);
    }

    /**
     * Tests the ascending minima when the input data are in ascending order
     * Input=[0.1,0.2,0.3,0.4,0.5]
     * AscendingMinima=[0.1,0.2,0.3,0.4,0.5]
     */
    @Test
    void testAscendingOrder() {
        inputData=Arrays.asList(0.1,0.2,0.3,0.4,0.5);
        expectedAscendingMinima=Arrays.asList(0.1,0.2,0.3,0.4,0.5);
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(expectedAscendingMinima, calculatedAscendingMinima);
    }

    /**
     * Tests the ascending minima when the input data are in descending order
     * Input=[0.5,0.4,0.3,0.2,0.1]
     * AscendingMinima=[0.1]
     */
    @Test
    void testDescendingOrder() {
        inputData=Arrays.asList(0.5,0.4,0.3,0.2,0.1);
        expectedAscendingMinima=Arrays.asList(0.1);
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(expectedAscendingMinima, calculatedAscendingMinima);
    }

    /**
     * Test using LinkedList as input
     */
    @Test
    void testLinkedListInput() {
        inputData = new LinkedList<>();
        expectedAscendingMinima = new ArrayList<>();
        inputData.add(0.5);
        inputData.add(0.4);
        inputData.add(0.3);
        inputData.add(0.2);
        inputData.add(0.1);
        expectedAscendingMinima.add(0.1);
        calculatedAscendingMinima = am.calcAscendingMinima(inputData);
        assertEquals(expectedAscendingMinima, calculatedAscendingMinima);
    }
}
