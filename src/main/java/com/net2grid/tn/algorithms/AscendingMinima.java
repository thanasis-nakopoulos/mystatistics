package com.net2grid.tn.algorithms;

import com.net2grid.tn.utils.StatisticUtilsStreamList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implements the Ascending Minima Algorithm.
 * The algorithm performs the following steps:<br>
 *     1) Calculate the minimum of the input data<br>
 *     2) Add the minimum to the ascendingMinima list<br>
 *     3) Modify the input data by removing all the data from the beginning till the last index of the input Data<br>
 *     4) Re-execute the algorithm till there are not any data in the input list<br>
 * Example: Input=[10.0,5.0,30.0,5.0,10.0,30.0,20.0]  , Ascending Minima=[5.0,10.0,20.0]
 * @author Thanasis Nakopoulos
 */
public class AscendingMinima {

    /**
     * Do nothing
     */
    public AscendingMinima() {
    }

    /**
     * Executes the Ascending Minima Algorithm.
     * @param inputList A list of double values for which to execute the Ascending Minima algorithm
     * @return The Ascending Minima of the input data
     *
     */
    public ArrayList<Double> calcAscendingMinima(List<Double> inputList) {
        // Create the ascendingMinima list
        ArrayList<Double> ascendingMinima = new ArrayList<>();
        // Do not execute the algorithm if the inputList is empty
        if(!inputList.isEmpty()){
            LinkedList<Double> iteratedList = new LinkedList<>(inputList);
            StatisticUtilsStreamList susal = new StatisticUtilsStreamList();
            double min;
            int index;
            // Execute the Ascending Algorithm until there are not any data in the list
            while (!iteratedList.isEmpty()) {
                // Calculate the minimum value of the dataset
                min = susal.calcMin(iteratedList);
                // Add the minimum value to the AscendingMinima list
                ascendingMinima.add(min);
                /* Get the last index of the minimum value and remove this index and all
                the previous indexes from the dataset*/
                index = iteratedList.lastIndexOf(min);
                for (int i = 0; i <= index; i++) {
                    iteratedList.removeFirst();
                }
            }
        }
        return ascendingMinima;
    }

}
