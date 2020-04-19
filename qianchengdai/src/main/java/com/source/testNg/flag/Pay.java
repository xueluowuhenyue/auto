package com.source.testNg.flag;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pay {

    @Test
    public void Shopping(){
        System.out.println("第一次购物");
    }
    @Test
    public void Shopping2(){
        System.out.println("第二次购物");
    }

    @Test(enabled=false) //忽略本条测试用例
    public void Shopping3(){
        System.out.println("第三次购物");
    }

    @Test//忽略本条测试用例
    public void Shopping4(){
        System.out.println("第四次购物");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("====开始执行购物功能测试用例====");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("====购物功能测试用例执行完毕====");
    }
}
