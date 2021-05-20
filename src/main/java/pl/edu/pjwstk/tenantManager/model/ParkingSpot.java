package pl.edu.pjwstk.tenantManager.model;

import pl.edu.pjwstk.tenantManager.model.storable.Storable;

import java.util.Set;

public class ParkingSpot extends BasicItem {

    private Set<Storable> storedItems;

    public Set<Storable> getStoredItems() {
        return storedItems;
    }

    public void setStoredItems(Set<Storable> storedItems) {
        this.storedItems = storedItems;
    }
}
