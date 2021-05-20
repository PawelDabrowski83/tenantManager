package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Apartment extends AreaItem {
    public static final double APARTMENT_AREA_BOUND = 200.0;
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



    @Override
    public String toString() {
        return "Apartment{" +
                "mainTenant=" + mainTenant +
                ", additionalTenantSet=" + additionalTenantSet +
                ", parkingSpot=" + parkingSpot + super.toString();
    }
}
