package com.sitairis.lab1.shop;

import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.workers.Worker;

import java.util.List;

public class AppliancesShop extends Shop {

    private int amountOfTestDevices;
    private List<Worker> workers;
    private List<Item> items;

    public AppliancesShop(List<Worker> workers, List<Item> items) {
        amountOfTestDevices = 0;
        this.workers = workers;
        this.items = items;
        System.out.println("Appliances shop created!");
        System.out.println("Items amount = "+items.size()+" workers amount = "+workers.size());
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

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void createSalesForTestDevices(){
        System.out.println("Created sales for test devices");
    }

    public void makeSaleForGoldCustomerOnTechnique() {
        System.out.println("Made sale on technique for a gold customer");
    }

}
