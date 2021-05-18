package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Developer {
    private Set<HousingEstate> housingEstateSet;

    public Developer(Set<HousingEstate> housingEstateSet) {
        this.housingEstateSet = housingEstateSet;
    }

    public Set<HousingEstate> getHousingEstateSet() {
        return housingEstateSet;
    }

    public void setHousingEstateSet(Set<HousingEstate> housingEstateSet) {
        this.housingEstateSet = housingEstateSet;
    }
}
