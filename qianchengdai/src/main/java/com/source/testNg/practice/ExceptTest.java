package com.source.testNg.practice;

import org.testng.annotations.Test;

public class ExceptTest {

/*    @Test(expectedExceptions = RuntimeException.class)
    public void exceptError(){
        System.out.println("这是一个失败的异常测试");
    }*/

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
