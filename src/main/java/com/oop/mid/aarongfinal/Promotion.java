package com.oop.mid.aarongfinal;

import java.time.LocalDate;

public class Promotion {
    private String id;
    private String name;
    private String product;
    private LocalDate startDate;
    private LocalDate endDate;
    private double discount;
    private String status;

    public Promotion(String id, String name, String product, LocalDate startDate, LocalDate endDate, double discount, String status) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
        this.status = status;
    }

    // Getters and Setters
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
