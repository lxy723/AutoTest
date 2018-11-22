package com.course.testng.Suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println();
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeClass(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterClass(){
        System.out.println("after test");
    }
}
