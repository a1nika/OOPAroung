package com.oop.mid;

public class EmployeeLeaveOfAbsence {
    String employeeName;
    int employeeID;
    String leaveDate;
    String leaveEnda;
    String leaveReason;

    public EmployeeLeaveOfAbsence(String employeeName, String leaveReason, String leaveEnda, String leaveDate, int employeeID) {
        this.employeeName = employeeName;
        this.leaveReason = leaveReason;
        this.leaveEnda = leaveEnda;
        this.leaveDate = leaveDate;
        this.employeeID = employeeID;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public String getLeaveEnda() {
        return leaveEnda;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setLeaveEnda(String leaveEnda) {
        this.leaveEnda = leaveEnda;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
