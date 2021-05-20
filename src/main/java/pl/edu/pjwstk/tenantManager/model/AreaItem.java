package pl.edu.pjwstk.tenantManager.model;

import java.time.LocalDateTime;

public abstract class AreaItem extends IdentifiableItem {

    private double area;
    private LocalDateTime startRenting;
    private LocalDateTime endRenting;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setArea(double width, double length, double height) {
        this.area = width * length * height;
    }

    public LocalDateTime getStartRenting() {
        return startRenting;
    }

    public void setStartRenting(LocalDateTime startRenting) {
        this.startRenting = startRenting;
    }

    public LocalDateTime getEndRenting() {
        return endRenting;
    }

    public void setEndRenting(LocalDateTime endRenting) {
        this.endRenting = endRenting;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "AreaItem{" +
                "area=" + area +
                ", startRenting=" + startRenting +
                ", endRenting=" + endRenting +
                '}';
    }
}
