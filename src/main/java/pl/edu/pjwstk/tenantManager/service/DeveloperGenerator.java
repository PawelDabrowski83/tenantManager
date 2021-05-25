package pl.edu.pjwstk.tenantManager.service;

import pl.edu.pjwstk.tenantManager.model.Developer;
import pl.edu.pjwstk.tenantManager.model.HousingEstate;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class DeveloperGenerator {

    public static Developer generateDeveloper() {
        Set<HousingEstate> housingEstateSet = new HashSet<>();
        int housingEstatesCount = ThreadLocalRandom.current().nextInt(Developer.ESTATES_BOUND);

        while (housingEstatesCount-- > 0) {
            housingEstateSet.add(HousingEstateGenerator.generateHousingEstate());
        }
        return new Developer(housingEstateSet);
    }
}
