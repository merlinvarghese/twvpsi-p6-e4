package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

class ParkingLotTest {
    @Test
    void expectParkingSuccessful() throws Exception {
        ParkingLot obj = new ParkingLot(8);
        try {
            obj.park(getVehicle());
            Assertions.fail("Cleaning in Progress");
        } catch (ParkException e) {
            e.printStackTrace();
        }
    }
    @Test
    void expectVehicleUnParkSSuccessful() throws Exception {
        ParkingLot obj = new ParkingLot(8);
        try {
            obj.unPark(getVehicle());

        } catch (ParkException e) {
            e.printStackTrace();
        }
    }

    private Vehicle getVehicle() {
        return new Vehicle() {
        };
    }


}
