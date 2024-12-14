package com.oop.mid;

public class HrHeadPerfomenceAnnalysis {
    String employeeName;
    String employeeID;
    String grade;


    public HrHeadPerfomenceAnnalysis(String employeeName, String grade, String employeeID) {
        this.employeeName = employeeName;
        this.grade = grade;
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
