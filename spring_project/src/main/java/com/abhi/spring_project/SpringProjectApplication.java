package com.abhi.spring_project;

import com.abhi.spring_project.sortAlgorithm.BinarySearchImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan
@Configuration
public class SpringProjectApplication {
    public static void main(String[] args) {
        try(var applicationContext = new AnnotationConfigApplicationContext(SpringProjectApplication.class)){
            var binarySearch = applicationContext.getBean(BinarySearchImplementation.class);
            System.out.println(binarySearch);
            int result = binarySearch.binarySearch(new int[]{1,2,3},3) ;
            System.out.println(result);
        }

    }

}
