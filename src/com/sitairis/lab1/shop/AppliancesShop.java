package com.sitairis.lab1.shop;

import com.sitairis.lab1.customers.Customer;

public class AppliancesShop extends Shop {

    private int amountOfTestDevices;
    private Customer customer;

    public AppliancesShop() {
        super();
        amountOfTestDevices = 0;
        customer = new Customer();
    }

    public AppliancesShop(String address, String phoneNumber, String name, int amountOfTestDevices) {
        super(address, phoneNumber, name);
        this.amountOfTestDevices = amountOfTestDevices;
        this.customer = new Customer();
    }

    public int getCustomerId() {
        return this.customer.getCustomerId();
    }

    public int getAmountOfTestDevices() {
        return amountOfTestDevices;
    }

    public void setAmountOfTestDevices(int amountOfTestDevices) {
        this.amountOfTestDevices = amountOfTestDevices;
    }

    public void createSalesForTestDevices(){
        System.out.println("Created sales for the test devices");
    }

    public void makeSaleForGoldCustomerOnTechnique() {
        System.out.println("Made a sale on technique for a gold customer");
    }

}
