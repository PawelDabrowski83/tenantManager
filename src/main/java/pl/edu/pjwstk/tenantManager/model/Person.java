package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Person extends IdentifiableItem {

    private boolean isMainTenant;
    private Set<Rentable> rentedItems;

    public boolean isMainTenant() {
        return isMainTenant;
    }

    public void setMainTenant(boolean mainTenant) {
        isMainTenant = mainTenant;
    }

    public Set<Rentable> getRentedItems() {
        return rentedItems;
    }

    public void setRentedItems(Set<Rentable> rentedItems) {
        this.rentedItems = rentedItems;
    }

    @Override
    public String toString() {
        return "Person{ " + super.toString() + " " +
                "isMainTenant=" + isMainTenant +
                ", rentedItems=" + rentedItems +
                '}';
    }
}
