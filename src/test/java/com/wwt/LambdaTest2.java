package com.wwt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 优化
 */
public class LambdaTest2 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("麻子", 9, 7777.77)
    );


    /**
     * 优化方式一：策略模式
     */
    @Test
    public void test01(){

        //查找员工年龄大于等于35的员工信息
        System.out.println(filterEmployee(employees, new FilterEmployeeByAge()));
        System.out.println("----------------------------------------------------");
        //查找员工工资大于等于5000的员工信息
        System.out.println(filterEmployee(employees, new FilterEmployeeBySalary()));

    }

    /**
     * 优化方式二：匿名内部类
     */
    @Test
    public void test02(){

        //查找员工工资小于等于5000的员工信息
        System.out.println(filterEmployee(employees, new MyPreDicate<Employee>(){

            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() <= 5000;
            }
        }));
        System.out.println("----------------------------------------");
        //查找员工年龄大于等于40的员工信息
        System.out.println(filterEmployee(employees, new MyPreDicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() >= 40;
            }
        }));


    }


    public List<Employee> filterEmployee(List<Employee> list, MyPreDicate<Employee> emp){

        List<Employee> emps = new ArrayList<>();

        for (Employee employee : list) {
            if(emp.test(employee)){
                emps.add(employee);
            }
        }
        return emps;
    }

    /**
     * 优化方式三：Lambda表达式
     */
    @Test
    public void test03(){
        //查找员工年龄大于等于35的员工信息
        System.out.println(filterEmployee(employees, (x) -> x.getAge() >= 35));
        System.out.println("-------------------------------------------------");
        //查找员工工资小于等于5000的员工信息
        System.out.println(filterEmployee(employees, (x) -> x.getSalary() <= 5000));
    }

    /**
     * 优化方式四：Stream API
     */
    @Test
    public void test04(){

        employees.stream()
                .filter((x) -> x.getSalary() >= 5000)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

}