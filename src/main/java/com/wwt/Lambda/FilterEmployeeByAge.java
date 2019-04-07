package com.wwt.Lambda;

public class FilterEmployeeByAge implements MyPreDicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }
}
