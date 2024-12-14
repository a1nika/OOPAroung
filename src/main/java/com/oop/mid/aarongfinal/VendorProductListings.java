// Model Class
package com.oop.mid.aarongfinal;

public class VendorProductListings {

    private String name;
    private String productCategory;
    private String qualityRating;
    private String status;
    private String vendor;

    // Constructor
    public VendorProductListings(String name, String productCategory, String qualityRating, String status, String vendor) {
        this.name = name;
        this.productCategory = productCategory;
        this.qualityRating = qualityRating;
        this.status = status;
        this.vendor = vendor;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(String qualityRating) {
        this.qualityRating = qualityRating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
