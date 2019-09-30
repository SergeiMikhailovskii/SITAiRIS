package com.sitairis.lab1;

import com.sitairis.lab1.customers.Customer;
import com.sitairis.lab1.item.Category;
import com.sitairis.lab1.item.Item;
import com.sitairis.lab1.order.Order;
import com.sitairis.lab1.shop.AppliancesShop;
import com.sitairis.lab1.workers.Worker;
import com.sitairis.lab1.workers.WorkerPlace;

public class Main {

    public static void main(String[] args) {
        AppliancesShop appliancesShop = new AppliancesShop();

        System.out.println();
        Worker worker = new Worker();
        Customer customer = new Customer();
        Item item = new Item();

        System.out.println();
        Order order = new Order(worker, customer, item);

        System.out.println();
        Category category = new Category();
        item.setCategory(category);

        System.out.println();
        WorkerPlace workerPlace = new WorkerPlace();
        worker.setWorkerPlace(workerPlace);
    }

}
