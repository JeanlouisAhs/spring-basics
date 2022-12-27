package com.example.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm() );
        int result =  binarySearch.binarySearch(new int[]{12,3,7}, 2);
        System.out.println(result);

        SpringApplication.run(SpringBasicsApplication.class, args);

    }
}