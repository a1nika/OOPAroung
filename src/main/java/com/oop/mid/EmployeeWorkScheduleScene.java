package com.oop.mid;

public class EmployeeWorkScheduleScene {

    String date;
    String assignment;

    public EmployeeWorkScheduleScene(String date, String assignment) {
        this.date = date;
        this.assignment = assignment;
    }

    public String getDate() {
        return date;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}
