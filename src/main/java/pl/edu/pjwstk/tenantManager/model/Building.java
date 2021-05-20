package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Building extends BasicItem {

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
}
