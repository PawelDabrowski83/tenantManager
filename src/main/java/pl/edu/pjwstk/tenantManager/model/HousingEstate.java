package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class HousingEstate extends IdentifiableItem {
    public static final int BUILDING_NUMBER_BOUND = 9;
    private Set<Building> buildingSet;

    public HousingEstate(Set<Building> buildingSet) {
        this.buildingSet = buildingSet;
    }

    public Set<Building> getBuildingSet() {
        return buildingSet;
    }

    public void setBuildingSet(Set<Building> buildingSet) {
        this.buildingSet = buildingSet;
    }

    @Override
    public String toString() {
        return "\n\nHousingEstate{ " + super.toString() + " " +
                "buildingSet=" + buildingSet +
                '}';
    }
}
