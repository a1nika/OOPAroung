package com.oop.mid.aarongfinal;

public class AddRemoveProducts {
    private String productId;
    private String productName;
    private String category;
    private String size;
    private int quantity;
    private double price;

    public AddRemoveProducts(String productId, String productName, String category, String size, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
