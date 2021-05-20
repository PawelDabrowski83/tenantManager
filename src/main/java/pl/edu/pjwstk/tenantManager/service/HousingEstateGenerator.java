package pl.edu.pjwstk.tenantManager.service;

import pl.edu.pjwstk.tenantManager.model.Building;
import pl.edu.pjwstk.tenantManager.model.HousingEstate;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class HousingEstateGenerator {

    public static HousingEstate generateHousingEstate() {
        Set<Building> buildingSet = new HashSet<>();
        int buildingNumber = ThreadLocalRandom.current().nextInt(HousingEstate.BUILDING_NUMBER_BOUND);
        for (int i = 0; i < buildingNumber; i++) {
            buildingSet.add(BuildingGenerator.generateBuilding());
        }
        return new HousingEstate(buildingSet);
    }
}
