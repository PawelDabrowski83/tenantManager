package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Apartment extends AreaItem {

    private Person mainTenant;
    private Set<Person> additionalTenantSet;
    private ParkingSpot parkingSpot;

    public Apartment(double area) {
        this.setArea(area);
    }

    public Apartment(double width, double length, double height) {
        this.setArea(width, length, height);
    }

    public Person getMainTenant() {
        return mainTenant;
    }

    public void setMainTenant(Person mainTenant) {
        this.mainTenant = mainTenant;
    }

    public Set<Person> getAdditionalTenantSet() {
        return additionalTenantSet;
    }

    public void setAdditionalTenantSet(Set<Person> additionalTenantSet) {
        this.additionalTenantSet = additionalTenantSet;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
