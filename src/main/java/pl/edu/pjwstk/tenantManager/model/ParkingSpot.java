package pl.edu.pjwstk.tenantManager.model;

import pl.edu.pjwstk.tenantManager.model.storable.Storable;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ParkingSpot extends AreaItem {
    public static final double PARKING_SPOT_AREA_BOUND = 40.0;
    private Set<Storable> storedItems;

    public ParkingSpot(double area) {
        this.setArea(area);
    }

    public ParkingSpot(double width, double length, double height) {
        this.setArea(width, length, height);
    }

    public Set<Storable> getStoredItems() {
        return storedItems;
    }

    public void setStoredItems(Set<Storable> storedItems) {
        this.storedItems = storedItems;
    }

    public static ParkingSpot generateParkingSpot() {
        return new ParkingSpot(ThreadLocalRandom.current().nextDouble() * PARKING_SPOT_AREA_BOUND);
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "storedItems=" + storedItems + super.toString() +
                '}';
    }
}
