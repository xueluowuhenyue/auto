package com.source.testNg.methodGroups;
import org.testng.annotations.*;

public class Login {

    @Test(groups = "student")
    public void Sign(){
        System.out.println("第一次登陆");
    }

    @Test(groups = "student")
    public void Sign2(){
        System.out.println("第二次登陆");
    }

    @Test(groups = "teacher")
    public void Sign3(){
        System.out.println("第三次登陆");
    }

    @Test(groups = "teacher")
    public void Sign4(){
        System.out.println("第四次登陆");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("====开始执行登陆功能测试用例====");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("====登陆功能测试用例执行完毕====");
    }

    @BeforeGroups(groups = "student")
    public void beforeGroups(){
        System.out.println("******这是前两次登录的测试方法******");
    }

    @AfterGroups(groups = "student")
    public void afterGroups(){
        System.out.println("=======这是前两次登录的测试方法======");
    }
}

