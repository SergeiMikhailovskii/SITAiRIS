package com.sitairis.lab1;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.order.Order;
import com.sitairis.lab1.shop.AppliancesShop;
import com.sitairis.lab1.workers.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Item item1 = new Item();
        Customer ivan = new Customer();
        Order order = new Order(1, worker1, item1, ivan);

        order.getWorkerId();
        order.getItemId();
        order.getCustomerId();

    }
}
