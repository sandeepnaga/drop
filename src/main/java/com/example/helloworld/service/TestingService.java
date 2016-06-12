package com.example.helloworld.service;

import lombok.Data;

/**
 * Created by sandeep.naga on 23/05/16.
 */
@Data
public class TestingService {

    private String firstVar = null;
    private String secondVar = null;


    public TestingService()
    {
      firstVar = "one";
        secondVar = "two";
    }

    public String serviceCall()
    {
        System.out.println("abc"+ firstVar + "def" + secondVar);
        return "abc";
    }
}
