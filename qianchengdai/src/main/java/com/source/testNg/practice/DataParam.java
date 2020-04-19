package com.source.testNg.practice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataParam {
/*    @Test(dataProvider="data")
    public void sign(String name,int age) {
        System.out.println("他的名字是：" + name + ", 今年" + age + "岁！");
    }

    //第一种参数化
    @DataProvider(name="data")
    public Object[][] providerDate(){
        Object[][] O=new Object[][]{
                {"星星",10},
                {"月亮",20},
                {"太阳",50}
        };
        return O;
    }*/

    //第二种参数化
    @Test(dataProvider="methodData")
    public void sign1(String name,int age) {
        System.out.println("第一次登陆 》》》：他的名字是：" + name + ", 今年" + age + "岁！");
    }

    @Test(dataProvider="methodData")
    public void sign2(String name,int age) {
        System.out.println("第二次登陆 》》》：他的名字是：" + name + ", 今年" + age + "岁！");
    }

    @Test(dataProvider="methodData")
    public void sign3(String name,int age) {
        System.out.println("第三次登陆 》》》：他的名字是：" + name + ", 今年" + age + "岁！");
    }

    @DataProvider(name="methodData")
    public Object[][] methodDateTest(Method method){
        Object[][] res =null;
        if(method.getName().equals("sign1")){
            res = new Object[][]{
                    {"张三",10},
                    {"李四",15}
            };
        }
        else if(method.getName().equals("sign2")){
            res = new Object[][]{
                    {"王五",20},
                    {"赵六",25}
            };
        }
        else{
            res = new Object[][]{
                    {"周七",60},
                    {"吴八",66}
            };
        }
        return res;
    }
}
