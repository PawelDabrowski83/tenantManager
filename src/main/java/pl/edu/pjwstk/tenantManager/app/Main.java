package pl.edu.pjwstk.tenantManager.app;

import pl.edu.pjwstk.tenantManager.model.Apartment;
import pl.edu.pjwstk.tenantManager.model.HousingEstate;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HousingEstate estate = new HousingEstate(new HashSet<>());
        Apartment apartment = new Apartment(17);
        System.out.println(estate.getId() + " " + apartment.getId());

    }
}
