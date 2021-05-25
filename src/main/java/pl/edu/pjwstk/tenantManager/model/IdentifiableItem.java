package pl.edu.pjwstk.tenantManager.model;

public abstract class IdentifiableItem {
    private static int ID_COUNTER = 0;
    private int id;

    public IdentifiableItem() {
        this.id = ID_COUNTER++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + getId();
    }
}
