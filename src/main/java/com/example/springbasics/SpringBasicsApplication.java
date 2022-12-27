package com.example.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    // What are the beans
    // what are the dependency for the bean?
    //What to search for a beans
        // the package where we are supposed to search beans.
        // but @SpringBootApplication search it automatically

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm() );
        //Get the beans for applications context
        ApplicationContext applicationContext =SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result =  binarySearch.binarySearch(new int[]{12,3,7}, 2);
        System.out.println(result);

    }
}