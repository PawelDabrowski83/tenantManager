package pl.edu.pjwstk.tenantManager.model;

public abstract class BasicItem {
    private static int ID_COUNTER = 0;
    private int id;
    private String name;

    public BasicItem(String name) {
        this.name = name;
        this.id = ID_COUNTER++;
    }
}
