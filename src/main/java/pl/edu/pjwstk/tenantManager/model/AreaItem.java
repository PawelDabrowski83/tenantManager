package pl.edu.pjwstk.tenantManager.model;

public abstract class AreaItem extends BasicItem {

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setArea(double width, double length, double height) {
        this.area = width * length * height;
    }
}
