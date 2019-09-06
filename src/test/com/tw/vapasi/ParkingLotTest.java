package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParkingLotTest {
    @Test
    void expectParkingSuccessful() {
        ParkingLot parkinglot = new ParkingLot(8);
        Parkable parkable = getVehicle();

        Assertions.assertDoesNotThrow(() -> parkinglot.park(parkable));
    }

    @Test
    void expectParkingUnsuccessful(){
        ParkingLot parkinglot = new ParkingLot(8);
        Parkable parkable = getVehicle();

        Assertions.assertThrows(ParkingFullException.class, () -> parkinglot.park(parkable));
    }

    @Test
    void expectToUnParkVehicleSuccessfully() {
        ParkingLot lot = new ParkingLot(8);
        Parkable parkable = getVehicle();
        try {
            lot.unPark(parkable);
        } catch (Exception e) {
            Assertions.fail("Failed");
        }
    }

    @Test
    void expectToUnParkVehicleNotParked() {
        ParkingLot lot = new ParkingLot(8);
        Parkable parkable = getVehicle();

        Assertions.assertThrows(CannotUnparkException.class, () -> lot.unPark(parkable));
    }

    @Test
    void expectTrueIfTheVehicleIsParked() throws ParkingFullException {
        ParkingLot lot = new ParkingLot(8);
        Parkable parkable = getVehicle();

        lot.park(parkable);
        Assertions.assertTrue(lot.isParkableParked(parkable));
    }

    private Parkable getVehicle() {
        return new Parkable() {
        };
    }

}

