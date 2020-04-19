package com.source.testNg.practice;

import org.testng.annotations.Test;

public class MultiThread {

    @Test(invocationCount = 10,threadPoolSize =5 )
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
