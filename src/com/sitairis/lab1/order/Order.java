package com.sitairis.lab1.order;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.workers.Worker;

public class Order {

    private int orderId;
    private Worker worker;
    private Item item;
    private Customer customer;

//    public Order() {
//        orderId = 1;
//        worker.workerId = 1;
//        itemId = 1;
//        customerId = 1;
//    }

    public Order(int orderId, Worker worker, Item item, Customer customer) {
        this.orderId = orderId;
        this.worker = worker;
        this.item = item;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getWorkerId() {
        return this.worker.getWorkerId();
    }

    public int getItemId() {
        return this.item.getItemId();
    }

    public int getCustomerId() {
        return this.customer.getCustomerId();
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
