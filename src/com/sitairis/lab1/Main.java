package com.sitairis.lab1;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Category;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.order.Order;
import com.sitairis.lab1.shop.AppliancesShop;
import com.sitairis.lab1.workers.Worker;
import com.sitairis.lab1.workers.WorkersRoom;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AppliancesShop appliancesShop = new AppliancesShop(List.of(new Worker(), new Worker()), List.of(new Item(), new Item()));

        System.out.println();
        Worker worker = new Worker();
        Customer customer = new Customer();
        System.out.println();
        System.out.println(customer.getName() + " is client of " + appliancesShop.getName() + " shop");

        Item item = new Item();

        System.out.println();
        Order order = new Order(worker, customer, item);
        order.getReceipt().getReceiptInfo();

        System.out.println();
        Category category = new Category();
        item.setCategory(category);

        System.out.println();
        WorkersRoom workersRoom = new WorkersRoom();
    }

}
