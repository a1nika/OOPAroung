package com.oop.mid.aarongfinal;

public class AddNewProducts {
    private String ProductName;
    private String ProductId;
    private String Category;
    private String SupplierName;
    private String InitialStockQuantity;
    private String UnitPrice;
    private String ReorderLevel;

    public AddNewProducts() {

    }


    public AddNewProducts(String ProductName, String ProductId, String Category, String SupplierName,
                          String InitialStockQuantity, String UnitPrice, String ReorderLevel) {
        this.ProductName = ProductName;
        this.ProductId = ProductId;
        this.Category = Category;
        this.SupplierName = SupplierName;
        this.InitialStockQuantity = InitialStockQuantity;
        this.UnitPrice = UnitPrice;
        this.ReorderLevel = ReorderLevel;
    }


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        this.ProductId = productId;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getInitialStockQuantity() {
        return InitialStockQuantity;
    }

    public void setInitialStockQuantity(String InitialStockQuantity) {
        this.InitialStockQuantity = InitialStockQuantity;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(String ReorderLevel) {
        this.ReorderLevel = ReorderLevel;
    }


    @Override
    public String toString() {
        return "AddNewProducts{"+
                "ProductName=" + ProductName +
                ", ProductId=" + ProductId +
                ", Category='" + Category + '\'' +
                ", SupplierName='" + SupplierName + '\'' +
                ", InitialStockQuantity='" + InitialStockQuantity + '\'' +
                ", UnitPrice='" + UnitPrice + '\'' +
                ", ReorderLevel=" + ReorderLevel +
                '}';

    };
}