package com.sitairis.lab1.order;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.workers.Worker;

public class Order {

    private static int amountOfOrders = 0;
    private int orderId;
    private int workerId;
    private int itemId;
    private String customerName;
    private Receipt receipt;

    public Order(Worker worker, Customer customer, Item item) {
        amountOfOrders++;
        orderId = amountOfOrders;
        this.workerId = worker.getWorkerId();
        this.itemId = item.getItemId();
        this.customerName = customer.getName();
        this.receipt = new Receipt();
        System.out.println("Order created");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) { this.orderId = orderId; }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public void agreeControlTerms() {
        System.out.println("Control terms agreed");
    }

    public void agreePayment() {
        System.out.println("Payment agreed");
    }

    public void createOrder() {
        System.out.println("Order created");
    }

}
