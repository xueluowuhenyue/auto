package com.source.testNg.flag;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuite开始运行啦！！！");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuite开始运行啦！！！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest开始运行啦！！！");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest开始运行啦！！！");
    }

}
