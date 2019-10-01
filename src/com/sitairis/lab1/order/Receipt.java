package com.sitairis.lab1.order;

public class Receipt {
    private String date;

    Receipt() {
        date = "11-22-63";
        System.out.println("Receipt created");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void getReceiptInfo() {
        System.out.println("Receipt created at: " + date);
    }

}
