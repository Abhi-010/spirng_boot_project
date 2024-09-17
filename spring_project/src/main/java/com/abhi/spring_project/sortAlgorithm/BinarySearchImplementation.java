package com.abhi.spring_project.sortAlgorithm;

import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplementation {

    private SortAlgorithm sortAlgorithm ;

    public BinarySearchImplementation(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm ;
    }

}
