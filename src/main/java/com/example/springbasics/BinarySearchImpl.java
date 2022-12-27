package com.example.springbasics;

public class BinarySearchImpl {

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
