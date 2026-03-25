package com.persistantemployee.model;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected EmployeeType type;

    public Employee(String name, String employeeId, EmployeeType type) {
        this.name = name;
        this.employeeId = employeeId;
        this.type = type;
    }
}
