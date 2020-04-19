package com.source.testNg.practice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void sign(String name,int age){
        System.out.println("他的名字是："+name+", 今年"+age+"岁！");
    }

}
