package com.wwt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Java8 内置的四大核心函数式接口
 *
 * Consumer<T>：消费型接口
 *      void accept(T t);
 *
 * Supplier<T>：供给型接口
 *      T get();
 *
 * Function<T, R>：函数型接口
 *      R apply(T t);
 *
 * Predicate<T>：断言型接口
 *      boolean test(T t);
 */
public class LambdaTest5 {


    //Consumer<T> 消费型接口
    @Test
    public void test01(){
        happy(10000, (m) -> System.out.println("消费了：" + m + "元"));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }


    //Supplier<T> 供给型接口
    @Test
    public void test02(){

        List<Integer> numList = getNumList(10, () -> (int)(Math.random()*100));
        for (Integer integer : numList) {
            System.out.println(integer);
        }
    }

    //需求：产生一些整数，并放入集合中
    public List<Integer> getNumList(Integer num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <num ; i++) {
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }


    //Function<T,R>函数型接口
    @Test
    public void test03(){
        System.out.println(strHandler(" \t\t\t 你好发单  ", (x) -> x.trim()));
        System.out.println(strHandler("你好发是的范德萨", (x) -> x.substring(2,5)));

    }

    //需求：用户处理字符串
    public String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }


    //Predicate<T>断言型接口
    @Test
    public void test04(){
        List<String> list = Arrays.asList("Hello","atrdfd","ok","wangwentao");
        //获取长度大于3的字符串集合
        System.out.println(filterStr(list, (x) -> x.length() > 3));
    }


    //需求：将满足条件的字符串放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();

        for (String s : list) {
            if(pre.test(s)){
                strList.add(s);
            }
        }
        return strList;
    }


}