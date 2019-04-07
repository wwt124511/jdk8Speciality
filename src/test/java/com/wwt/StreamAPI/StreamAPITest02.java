package com.wwt.StreamAPI;

import com.wwt.Lambda.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;


/**
 * 一： Stream的三个操作步骤
 *      1. 创建Stream
 *      2. 中间操作
 *      3. 终止操作（终端操作）
 */
public class StreamAPITest02 {


    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("麻子", 9, 7777.77),
            new Employee("麻子", 9, 7777.77),
            new Employee("麻子", 9, 7777.77)
    );


    //中间操作
    /*
     * 筛选与切片
     * filter： 接收Lambda，从流中排除某些元素
     * limit： 截断流，使其元素不超过给定数量
     * skip(n)： 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。
     *              与limit(n)互补
     * distinct： 筛选，通过流所生成元素的hashCode()和equals()去除重复元素
     */
    @Test
    public void test01(){
        //中间操作：不会执行任何操作
        Stream<Employee> stream = employees.stream().filter((x) -> {
            System.out.println("Stream API的中间操作");
            return  x.getAge() > 35;
        });
        //终止操作：一次性执行全部内容，即“惰性求值”或者“延迟加载”
        stream.forEach(System.out::println);
    }

    @Test
    public void test02(){
        employees.stream()
                .filter((x) -> {
                    System.out.println("短路！");
                    return x.getSalary() > 5000;
                })
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test03(){
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .distinct()
                .skip(2)
                .forEach(System.out::println);
    }


}