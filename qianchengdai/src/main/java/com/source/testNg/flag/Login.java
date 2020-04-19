package com.source.testNg.flag;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void Sign(){
        System.out.println("第一次登陆");
    }

    @Test(enabled = false)
    public void Sign2(){
        System.out.println("第二次登陆");
    }

    @Test
    public void Sign3(){
        System.out.println("第三次登陆");
    }

    @Test
    public void Sign4(){
        System.out.println("第四次登陆");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("====开始执行登陆功能测试用例====");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("====登陆功能测试用例执行完毕====");
    }
}

