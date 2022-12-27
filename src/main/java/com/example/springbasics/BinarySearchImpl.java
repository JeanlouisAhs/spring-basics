package com.example.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[]  sortedNumbers =   sortAlgorithm .sort(numbers);
        // Sorting array
        //Sort the array
        //Return th result
        System.out.println(sortAlgorithm);
        return 2;
    }

}
