package com.persistantemployee.model;
public class SalariedEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public SalariedEmployee(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId, EmployeeType.SALARIED);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateEarnings() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Earnings: " + calculateEarnings();
    }

    // Getters and setters for JSON handling
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
}