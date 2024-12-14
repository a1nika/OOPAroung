package com.oop.mid.aarongfinal;

public class EmployeeRemoteWork {
    String employeeName;
    int employeeID;
    String remoteWorkStartDate;
    String remoteWorkEndDate;
    String reason;

    public EmployeeRemoteWork(String employeeName, int employeeID, String remoteWorkStartDate, String remoteWorkEndDate, String reason) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.remoteWorkStartDate = remoteWorkStartDate;
        this.remoteWorkEndDate = remoteWorkEndDate;
        this.reason = reason;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getRemoteWorkStartDate() {
        return remoteWorkStartDate;
    }

    public String getRemoteWorkEndDate() {
        return remoteWorkEndDate;
    }

    public String getReason() {
        return reason;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setRemoteWorkStartDate(String remoteWorkStartDate) {
        this.remoteWorkStartDate = remoteWorkStartDate;
    }

    public void setRemoteWorkEndDate(String remoteWorkEndDate) {
        this.remoteWorkEndDate = remoteWorkEndDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
