package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Building extends IdentifiableItem {
    public static final int APARTMENT_NUMBER_BOUND = 100;
    private Set<Apartment> apartmentSet;

    public Building(Set<Apartment> apartmentSet) {
        this.apartmentSet = apartmentSet;
    }

    public Set<Apartment> getApartmentSet() {
        return apartmentSet;
    }

    public void setApartmentSet(Set<Apartment> apartmentSet) {
        this.apartmentSet = apartmentSet;
    }

    @Override
    public String toString() {
        return "\n\nBuilding{" + super.toString() + " " +
                "apartmentSet=" + apartmentSet +
                '}';
    }
}
