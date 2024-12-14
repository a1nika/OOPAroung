package com.oop.mid.aarongfinal;

public class CustomerBehavior {
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String category;
    private String product;
    private double amount;

    public CustomerBehavior(String id, String name, String gender, String dob, String category, String product, double amount) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.category = category;
        this.product = product;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
