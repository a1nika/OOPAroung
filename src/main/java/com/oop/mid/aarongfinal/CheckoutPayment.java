package com.oop.mid.aarongfinal;

public class CheckoutPayment {

    private String contactNo;
    private String customerName;
    private String email;
    private String address;
    private String paymentMethod;
    private double productPrice;
    private double totalAmount;

    // Constructor to initialize the product and customer details
    public CheckoutPayment(String contactNo, String customerName, String email, String address, String paymentMethod, double productPrice, double totalAmount) {
        this.contactNo = contactNo;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.productPrice = productPrice;
        this.totalAmount = totalAmount;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
