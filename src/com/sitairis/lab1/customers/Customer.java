package com.sitairis.lab1.customers;

public class Customer {

    private int amountOfOrders;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer() {
        amountOfOrders = 0;
        name = "Ivan Ivanov";
        address = "Address 1";
        phoneNumber = "987-65-43";
        System.out.println("Customer created");
    }

    public Customer(int amountOfOrders, String name, String address, String phoneNumber) {
        this.amountOfOrders = amountOfOrders;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getAmountOfOrders() {
        return amountOfOrders;
    }

    public void setAmountOfOrders(int amountOfOrders) {
        this.amountOfOrders = amountOfOrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeOrder(){
        System.out.println("In make order");
    }

}
