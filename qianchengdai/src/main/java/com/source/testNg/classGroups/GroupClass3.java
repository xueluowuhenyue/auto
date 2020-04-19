package com.source.testNg.classGroups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupClass3 {
    public void stu1(){
        System.out.println("GroupClass3中的stu1运行******");
    }

    public void stu2(){
        System.out.println("GroupClass3中的stu2运行******");
    }
}
