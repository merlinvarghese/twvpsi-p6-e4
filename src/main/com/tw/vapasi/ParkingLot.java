package com.tw.vapasi;

import java.util.ArrayList;
import java.util.List;

//understands parking space for all types of vehicles
public class ParkingLot {
    private int noOfSlots;
    private List<Parkable> parkedVehicles;

    public ParkingLot(int noOfSlots) {
        parkedVehicles = new ArrayList<>();
        this.noOfSlots = noOfSlots;
    }

    void park(Parkable parkable) throws ParkingFullException {
        if (isSlotNotAvailable()) {
            throw new ParkingFullException();
        }
        parkedVehicles.add(parkable);
    }

    void unPark(Parkable parkable) throws CannotUnparkException {
        if (isParkableUnparked(parkable)) {
            throw new CannotUnparkException();
        }
        parkedVehicles.remove(parkable);
    }

    private boolean isSlotNotAvailable() {
        return parkedVehicles.size() == noOfSlots;
    }

    private boolean isParkableUnparked(Parkable parkable) {
        return !parkedVehicles.contains(parkable);
    }

    boolean isParkableParked(Parkable parkable) {
        return parkedVehicles.contains(parkable);
    }
}




