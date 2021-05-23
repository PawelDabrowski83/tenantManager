package pl.edu.pjwstk.tenantManager.app;

import pl.edu.pjwstk.tenantManager.model.Apartment;
import pl.edu.pjwstk.tenantManager.model.HousingEstate;
import pl.edu.pjwstk.tenantManager.model.ParkingSpot;
import pl.edu.pjwstk.tenantManager.service.ApartmentGenerator;
import pl.edu.pjwstk.tenantManager.service.HousingEstateGenerator;


public class Main {
    public static void main(String[] args) {

        HousingEstate estate = HousingEstateGenerator.generateHousingEstate();
        Apartment apartment = ApartmentGenerator.generateApartment();
        ParkingSpot parkingSpot = ParkingSpot.generateParkingSpot();

        System.out.println(parkingSpot);


    }
}
