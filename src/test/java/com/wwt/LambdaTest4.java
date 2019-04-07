package com.wwt;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaTest4 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("麻子", 9, 7777.77)
    );

    /**
     * 需求：
     *      调用Collections.sort()方法，通过定制排序比较两个Employee
     *      （先按年龄比，年龄相同按姓名比）
     */
    @Test
    public void test01(){

        Collections.sort(employees, (e1, e2) -> {
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return -Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }


    /**
     * 需求：
     * 1. 声明函数式接口，接口中声明抽象方法， public String getValue(String str);
     * 2. 声明类 TestLambda，类中编写方法使用接口作为参数，将一个字符串转换成大写，并作为方法的返回值
     * 3. 再将一个字符串的第二个和第四个索引位置进行截取字符串
     */
    @Test
    public void test02(){

        System.out.println(strHandler("\t\t\t 你好，jdk8 ", (x) -> x.trim()));

        System.out.println(strHandler("abcd", (x) -> x.toUpperCase()));
        System.out.println(strHandler("我是java开发工程师", (x) -> x.substring(2, 5)));

        op(100L, 200L, (x,y) -> x+y);
        op(100L, 200L, (x,y) -> x*y);
    }




    //用户处理字符串的方法
    public String strHandler(String str, MyFunction mf){
        return mf.getValue(str);
    }

    //需求：对两个Long型数值进行处理
    public void op(Long t1, Long t2, MyFunctin2<Long, Long> mf){
        System.out.println(mf.getValue(t1, t2));
    }

}