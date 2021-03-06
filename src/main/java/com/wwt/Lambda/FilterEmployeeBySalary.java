package com.wwt.Lambda;

public class FilterEmployeeBySalary implements MyPreDicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
