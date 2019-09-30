package com.sitairis.lab1.shop;

public class AppliancesShop extends Shop {

    private int amountOfTestDevices;

    public AppliancesShop() {
        amountOfTestDevices = 0;
        System.out.println("Appliances shop created!");
    }

    public AppliancesShop(String address, String phoneNumber, String name, int amountOfTestDevices) {
        super(address, phoneNumber, name);
        this.amountOfTestDevices = amountOfTestDevices;
    }

    public int getAmountOfTestDevices() {
        return amountOfTestDevices;
    }

    public void setAmountOfTestDevices(int amountOfTestDevices) {
        this.amountOfTestDevices = amountOfTestDevices;
    }

    public void createSalesForTestDevices(){
        System.out.println("Created sales for test devices");
    }

    public void makeSaleForGoldCustomerOnTechnique() {
        System.out.println("Made sale on technique for a gold customer");
    }

}
