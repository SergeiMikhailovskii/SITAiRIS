package com.sitairis.lab1.order;

public class Order {

    private int orderId;
    private int workerId;
    private int itemId;
    private String customerName;

    public Order() {
        orderId = 0;
        workerId = 0;
        itemId = 0;
        customerName = "Customer 1";
    }

    public Order(int orderId, int workerId, int itemId, String customerName) {
        this.orderId = orderId;
        this.workerId = workerId;
        this.itemId = itemId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

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
