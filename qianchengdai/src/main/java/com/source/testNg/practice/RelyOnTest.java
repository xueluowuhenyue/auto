package com.source.testNg.practice;

import org.testng.annotations.Test;

public class RelyOnTest {
    @Test
    public void login(){
        System.out.println("登录成功");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"login"}) //依赖login方法，其他类等依赖类似,
    public void pay(){                  //当被依赖的方法执行失败时，后面方法不再执行
        System.out.println("***开始支付***");
    }
}
