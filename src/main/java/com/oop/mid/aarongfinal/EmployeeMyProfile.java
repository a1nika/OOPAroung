package com.oop.mid.aarongfinal;

public class EmployeeMyProfile {
    String EmployeeName;
    int Age;
    int PhoneNumber;
    String Address;

    public EmployeeMyProfile(String employeeName, int age, int phoneNumber, String address) {
        EmployeeName = employeeName;
        Age = age;
        PhoneNumber = phoneNumber;
        Address = address;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public int getAge() {
        return Age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
