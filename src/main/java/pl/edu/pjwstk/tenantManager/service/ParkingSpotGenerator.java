package pl.edu.pjwstk.tenantManager.service;

import pl.edu.pjwstk.tenantManager.model.ParkingSpot;

import java.util.concurrent.ThreadLocalRandom;

public class ParkingSpotGenerator {
    public static ParkingSpot generateParkingSpot() {
        return new ParkingSpot(ThreadLocalRandom.current().nextDouble() * ParkingSpot.PARKING_SPOT_AREA_BOUND);
    }
}
