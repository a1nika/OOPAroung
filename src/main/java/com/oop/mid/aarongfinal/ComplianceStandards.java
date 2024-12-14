package com.oop.mid.aarongfinal;

public class ComplianceStandards {
    private String productCategory;
    private String industry;
    private String region;

    // Constructor
    public ComplianceStandards(String productCategory, String industry, String region) {
        this.productCategory = productCategory;
        this.industry = industry;
        this.region = region;
    }

    // Getters and Setters
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "ComplianceStandard{" +
                "productCategory='" + productCategory + '\'' +
                ", industry='" + industry + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}