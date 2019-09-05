package com.tw.vapasi;

import java.util.ArrayList;
import java.util.List;

//understands parking space for all types of vehicles
public class ParkingLot {
    private int noOfSlots;
    private List<Vehicle> slotList;

    public ParkingLot(int noOfSlots) {
        slotList = new ArrayList<>();
        this.noOfSlots = noOfSlots;
    }

    void park(Vehicle vehicle) throws Exception {
        if (slotList.size() == noOfSlots) {
            throw new Exception("Parking Full");
        }
        slotList.add(vehicle);
    }

    void unPark(Vehicle vehicle) throws Exception {
        if (!slotList.contains(vehicle)) {
            throw new Exception("Cannot UnPark");
        }
        slotList.remove(vehicle);
    }
}




