package com.sitairis.lab1.shop;

public class AppliancesShop extends Shop {

    private int amountOfTestDevices;

    public AppliancesShop() {
        super();
        amountOfTestDevices = 0;
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

}
