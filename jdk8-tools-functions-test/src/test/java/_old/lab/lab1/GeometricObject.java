package _old.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-2 GeometricObject抽象?
 */

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();

    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

    }

    public boolean ifFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on" + dateCreated + "\ncolor:" + color + "and filled:" + filled;
    }

    // 这两个方法待实现
    public abstract double getArea();

    public abstract double getPerimeter();

}
