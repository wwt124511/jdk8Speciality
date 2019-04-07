package com.wwt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Lambda表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符成为箭头操作符或Lambda操作符
 *
 * 左侧：Lambda表达式的参数列表
 * 右侧：Lambda表达式中所需要执行的功能，即Lambda体
 *
 * 语法格式一：无参数，无返回值
 *      () -> System.out.println("hello Lambda")
 *
 * 语法格式二：有一个参数，并且无返回值
 *      (x) -> System.out.println("hello Lambda")
 *
 * 语法格式三：有一个参数，并且无返回值，参数的小括号可以不写
 *      x -> System.out.println("hello Lambda")
 *
 *  语法格式四：有两个以上的参数，并且Lambda体中多条语句，并且有返回值
 *      (x,y) -> {
 *                  int a = 23;
 *                  return a;
 *                  }
 *
 *  语法格式五：若Lambda体中只有一条语句，那么return和{}都可以不写
 *      (x,y) -> System.out.println("hello Lambda")
 *
 *  语法格式六：
 *          Lambda表达式的参数列表的数据类型可以省略不写，因为JVM编译器可以通过
 *      上下文推断出数据类型，即【类型推断】
 *
 *
 *  二： Lambda 表达式需要“函数式接口”的支持
 *      函数式接口：接口中只有一个抽象方法，成为函数式接口
 *
 *
 */
public class LambdaTest3 {


    //语法格式一：无参数，无返回值
    @Test
    public void test01(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r.run();

        System.out.println("----------------------------------");

        Runnable r1 = () -> System.out.println("hello Lambda");
        r1.run();
    }

    //语法格式二：有一个参数，并且无返回值
    @Test
    public void test02(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("hello");
    }


    //语法格式四：有两个以上的参数，并且Lambda体中多条语句，并且有返回值
    @Test
    public void test04(){
        Comparator<Integer> com = (x,y) -> {
            System.out.println("这是函数式接口");
            return Integer.compare(x,y);
        };

    }

    //语法格式五
    @Test
    public void test05(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
    }


    @Test
    public void test06(){

        //此处后面的ArrayList类型可以不写，根据类型推断可以得出
        List<String> list = new ArrayList<>();

        //此处参数map类型可以不写，根据类型推断可以得出
        show(new HashMap<>());
    }

    private void show(HashMap<String, Integer> map) {
    }


    //需求：对一个数进行运算
    @Test
    public void test07(){
        System.out.println(operation(100,(x) -> x*x));
        System.out.println(operation(200, (y) -> y+200));
    }

    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }
}