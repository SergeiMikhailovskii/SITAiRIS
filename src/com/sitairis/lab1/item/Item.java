package com.sitairis.lab1.item;

public class Item {

    private int itemId;
    private String name;
    private Category category;

    public Item() {
        itemId = 0;
        name = "Item1";
        System.out.println("Item created");
    }

    public Item(int itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        System.out.println("Set category to item");
    }
}
