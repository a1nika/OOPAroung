package com.oop.mid;

public class HrHeadDistributeSalary {
    String employeeName;
    String employeeID;
    String employeeSalary;
    String month;


    public HrHeadDistributeSalary(String employeeName, String month, String employeeSalary, String employeeID) {
        this.employeeName = employeeName;
        this.month = month;
        this.employeeSalary = employeeSalary;
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public String getMonth() {
        return month;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
