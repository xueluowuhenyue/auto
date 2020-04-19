package com.source.testNg.practice;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void test1() {
        System.out.println("第一条测试用例");
    }

    @Test
    public void test2() {
        System.out.println("第二条测试用例");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("方法执行前的beforeMethod标签");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("方法执行之后的afterMethod标签");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类执行前的beforeClass标签");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类执行之后的afterClass标签");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件执行前的beforeSuite标签");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件执行之后的afterSuite标签");
    }
}


