package _bai.interface_test;

public class Circle implements ICircle {
    @Override
    public double getCircumference(double radius) {
        return 2 * PI * radius;
    }

    @Override
    public double getArea(double radius) {
        return PI * radius * radius;
    }

    @Override
    public double getVolume(double radius) {
        return 4 * PI * radius * radius * radius / 3.0;
    }
}
