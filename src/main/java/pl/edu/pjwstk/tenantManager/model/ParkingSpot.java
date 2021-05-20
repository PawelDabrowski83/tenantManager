package pl.edu.pjwstk.tenantManager.model;

import pl.edu.pjwstk.tenantManager.model.storable.Storable;

import java.util.Set;

public class ParkingSpot extends AreaItem {

    public ParkingSpot(double area) {
        this.setArea(area);
    }

    public ParkingSpot(double width, double length, double height) {
        this.setArea(width, length, height);
    }

    private Set<Storable> storedItems;

    public Set<Storable> getStoredItems() {
        return storedItems;
    }

    public void setStoredItems(Set<Storable> storedItems) {
        this.storedItems = storedItems;
    }
}
