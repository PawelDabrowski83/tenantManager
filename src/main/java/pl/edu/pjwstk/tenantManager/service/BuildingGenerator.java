package pl.edu.pjwstk.tenantManager.service;

import pl.edu.pjwstk.tenantManager.model.Apartment;
import pl.edu.pjwstk.tenantManager.model.Building;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BuildingGenerator {

    public static Building generateBuilding() {
        Set<Apartment> apartmentSet = new HashSet<>();
        int apartmentNumber = ThreadLocalRandom.current().nextInt(Building.APARTMENT_NUMBER_BOUND);
        for (int i = 0; i < apartmentNumber; i++) {
            apartmentSet.add(ApartmentGenerator.generateApartment());
        }
        return new Building(apartmentSet);
    }
}
