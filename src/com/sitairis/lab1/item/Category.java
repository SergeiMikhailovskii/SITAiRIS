package com.sitairis.lab1.item;

import java.util.List;

public class Category {

    private int categoryId;
    private String name;
    private String description;

    private List<Item> items;

    public Category() {
        categoryId = 0;
        name = "Category 1";
        description = "Description 1";

        items = List.of(new Item(), new Item(), new Item());

        System.out.println("Category created");
        System.out.println("Items amount in category = " + items.size());
    }

    public Category(int categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
