package com.org.example;

import java.text.NumberFormat;

/**
 *
 * @author Manase
 */
public class ProductListing {

    private String date;
    private final String product;
    private final double price;
    private final int quantity;
    private final double totalAmount;

    ProductListing(String product, double price, int quantity, double totalAmount) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
    
    ProductListing(String date, String product, int quantity){
        this(product, 0.0, quantity, 0.0);
        this.date = date;       
    }

    String getDate() {
        return date;
    }
    
    String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
    
    int getQuantity() {
        return quantity;
    }
    
    double getTotalAmount() {
        return totalAmount;
    }
    
    static String setCurrency(double value) {
        return NumberFormat.getCurrencyInstance().format(value);
    }
    
    @Override 
    public String toString() {
        return String.format(" %s\t%s\t%s\t%s%n", getProduct(), setCurrency(getPrice()), 
                getQuantity(), setCurrency(getTotalAmount()));
    }
}