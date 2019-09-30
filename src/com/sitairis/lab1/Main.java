package com.sitairis.lab1;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.order.Order;
import com.sitairis.lab1.shop.AppliancesShop;
import com.sitairis.lab1.workers.Worker;

public class Main {

    public static void main(String[] args) {
        AppliancesShop appliancesShop = new AppliancesShop();

        Worker worker = new Worker();
        Customer customer = new Customer();
        Item item = new Item();

        Order order = new Order(worker, customer, item);
    }
}
