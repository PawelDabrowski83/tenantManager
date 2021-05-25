package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class Developer extends IdentifiableItem{
    public static final int ESTATES_BOUND = 3;

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

    @Override
    public String toString() {
        return "\nDeveloper{" + super.toString() + " " +
                "housingEstateSet=" + housingEstateSet +
                '}';
    }
}
