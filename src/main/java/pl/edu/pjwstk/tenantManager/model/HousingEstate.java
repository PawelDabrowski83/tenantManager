package pl.edu.pjwstk.tenantManager.model;

import java.util.Set;

public class HousingEstate extends BasicItem {

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
}
