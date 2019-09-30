package com.sitairis.lab1.shop;

public class Shop {

    private String address;
    private String phoneNumber;
    private String name;

    public Shop() {
        address = "Nezavisimosti avenue";
        phoneNumber = "123-45-67";
        name = "Hit";
        System.out.println("Shop created");
    }

    public Shop(String address, String phoneNumber, String name) {
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createNewPosition(){
        System.out.println("New position created!");
    }

}
