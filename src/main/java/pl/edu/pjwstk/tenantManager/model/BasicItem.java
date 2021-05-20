package pl.edu.pjwstk.tenantManager.model;

public abstract class BasicItem {
    private static int ID_COUNTER = 0;
    private int id;

    public BasicItem() {
        this.id = ID_COUNTER++;
    }

    public int getId() {
        return id;
    }
}
