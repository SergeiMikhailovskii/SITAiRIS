package com.sitairis.lab1.workers;

public class Worker {

    private int workerId;
    private int experience;
    private boolean accessToDb;
    private String name;

    public Worker() {
        workerId = 0;
        experience = 0;
        accessToDb = false;
        name = "Dimas";
        System.out.println("Worker created");
    }

    public Worker(int workerId, int experience, boolean accessToDb, String name) {
        this.workerId = workerId;
        this.experience = experience;
        this.accessToDb = accessToDb;
        this.name = name;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isAccessToDb() {
        return accessToDb;
    }

    public void setAccessToDb(boolean accessToDb) {
        this.accessToDb = accessToDb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void processCustomerOrder(){
        System.out.println("Processing customer's order");
    }

    public void provideCustomerByInfo(){
        System.out.println("Providing customer by info");
    }

    public void giveProfitToBank(){
        System.out.println("Giving profit to bank");
    }

}
