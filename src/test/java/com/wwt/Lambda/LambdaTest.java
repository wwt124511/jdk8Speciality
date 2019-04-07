package com.wwt.Lambda;

import com.wwt.Lambda.Employee;
import org.junit.Test;

import java.util.*;

/**
 * 普通遍历方式实现员工信息筛选
 */
public class LambdaTest {


    /**
     * 内部类方式实现比较两数大小
     */
    @Test
    public void test01(){

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);

    }

    /**
     * Lambda表达式
     */
    @Test
    public void test02(){
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> ts = new TreeSet<>(com);

    }


    /**
     * 获取当前公司中员工年龄大于35的员工信息
     */
    @Test
    public void test03(){
        List<Employee> list = filterEmployee(employees);
        for (Employee employee : list) {
            System.out.println(employee);
        }


    }


    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("麻子", 9, 7777.77)
    );

    public List<Employee> filterEmployee(List<Employee> list){
        List<Employee> emps = new ArrayList<>();
        for(Employee emp : list){
            if(emp.getAge() >= 35){
                emps.add(emp);
            }
        }
        return emps;
    }


    /**
     * 获取当前公司中员工工资大于5000的员工信息
     */
    @Test
    public void test04(){
        List<Employee> list = filterEmployee2(employees);
        for (Employee employee : list) {
            
        }
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public List<Employee> filterEmployee2(List<Employee> list){
        List<Employee> emps = new ArrayList<>();
        for(Employee emp : list){
            if(emp.getSalary() >= 5000){
                emps.add(emp);
            }
        }
        return emps;
    }
}