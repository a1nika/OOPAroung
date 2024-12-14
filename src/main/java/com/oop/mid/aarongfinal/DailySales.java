// Model Class
package com.oop.mid.aarongfinal;

public class DailySales {

    private String date;
    private String productName;
    private String storeLocation;
    private int totalUnitsSold;
    private int unitsSold;

    // Constructor
    public DailySales(String date, String productName, String storeLocation, int totalUnitsSold, int unitsSold) {
        this.date = date;
        this.productName = productName;
        this.storeLocation = storeLocation;
        this.totalUnitsSold = totalUnitsSold;
        this.unitsSold = unitsSold;
    }

    // Getters and setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public int getTotalUnitsSold() {
        return totalUnitsSold;
    }

    public void setTotalUnitsSold(int totalUnitsSold) {
        this.totalUnitsSold = totalUnitsSold;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
}
