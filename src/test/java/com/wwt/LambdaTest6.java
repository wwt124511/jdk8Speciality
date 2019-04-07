package com.wwt;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Lambda表达式中的方法引用方式
 *
 * 主要有三种语法格式
 * 1. 对象::实例方法名
 * 2. 类::静态方法名
 * 3. 类::实例方法名
 *
 * 注意：
 *  1. Lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致
 *  2.
 *
 *  二：构造器引用
 *  格式：
 *         ClassName::new
 *
 */
public class LambdaTest6 {


    @Test
    public void test01(){
        Consumer<String> con = (x) -> System.out.println(x);

        //实例方法引用
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;

        Consumer<String> con2 = System.out::println;
        con2.accept("adfdf");

    }

    @Test
    public void test02(){
        Employee emp = new Employee();
        Supplier<String> sup = () -> emp.getName();
        String str = sup.get();
        System.out.println(str);

        Supplier<Integer> sup2 = emp::getAge;
        System.out.println(sup2.get());
    }

    //类::静态方法名
    @Test
    public void test03(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);

        Comparator<Integer> com2 = Integer::compareTo;
    }


    //类::实例方法名
    @Test
    public void test4(){
        BiPredicate<String, String> bp = (x,y) -> x.equals(y);
        BiPredicate<String, String> bp2 = String::equals;
    }

}