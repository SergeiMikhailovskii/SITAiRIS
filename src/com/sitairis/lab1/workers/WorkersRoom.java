package com.sitairis.lab1.workers;

import java.util.List;

public class WorkersRoom {
    private int roomNumber;
    private final int MAX_AMOUNT = 10;
    private List<Worker> workers;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public WorkersRoom() {
        roomNumber = 0;
        workers = List.of(new Worker(), new Worker(), new Worker());
        System.out.println("Room created");
        System.out.println("Amount of workers = " + workers.size());
    }
}
