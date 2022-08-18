/* Name - Twisha Chachra
Student Number - 200474646 */
package com.example.w22comp1011gctest2student;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String totalPurchase;
    public Customer(int customerId, String firstName, String lastName, String phone, ArrayList<Product> products) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    private int customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private ArrayList<Product> products;

    public double amountOfTotalPurchases() {
        ArrayList<Customer> customers = jsonClass.loadDataFromJson();
        double totalAmount = 0;
        for (Customer c : customers) {
            for(Product p : c.getProducts()){
                totalAmount += p.getSalePrice();
            }
        }
 return totalAmount;
    }

}
