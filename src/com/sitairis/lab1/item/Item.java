package com.sitairis.lab1.item;

public class Item {

    private int itemId;
    private String name;

    public Item() {
        itemId = 0;
        name = "Item1";
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

}
