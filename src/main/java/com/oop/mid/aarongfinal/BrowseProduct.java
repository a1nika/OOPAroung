package com.oop.mid.aarongfinal;

public class BrowseProduct {
    private String productName;
    private String category;
    private String price;
    private String size;

    // Constructor
    public BrowseProduct(String productName, String category, String price, String size) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.size = size;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}




