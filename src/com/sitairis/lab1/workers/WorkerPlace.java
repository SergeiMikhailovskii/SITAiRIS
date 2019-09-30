package com.sitairis.lab1.workers;

public class WorkerPlace {

    private int placeId;
    private int roomNumber;
    private boolean isNearWindow;

    public WorkerPlace() {
        placeId = 0;
        roomNumber = 0;
        isNearWindow = false;
        System.out.println("Worker place created");
    }

    public WorkerPlace(int placeId, int roomNumber, boolean isNearWindow) {
        this.placeId = placeId;
        this.roomNumber = roomNumber;
        this.isNearWindow = isNearWindow;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isNearWindow() {
        return isNearWindow;
    }

    public void setNearWindow(boolean nearWindow) {
        isNearWindow = nearWindow;
    }

}
