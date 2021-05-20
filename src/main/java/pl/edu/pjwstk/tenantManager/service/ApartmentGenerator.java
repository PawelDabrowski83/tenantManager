package pl.edu.pjwstk.tenantManager.service;

import pl.edu.pjwstk.tenantManager.model.Apartment;

import java.util.concurrent.ThreadLocalRandom;

public class ApartmentGenerator {
    public static Apartment generateApartment() {
        return new Apartment(ThreadLocalRandom.current().nextDouble() * Apartment.APARTMENT_AREA_BOUND);
    }
}
