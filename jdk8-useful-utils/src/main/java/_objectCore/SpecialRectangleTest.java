package _objectCore;

public class SpecialRectangleTest {

    public static void main(String[] args) {
        SpecialRectangle paper = new SpecialRectangle();

        paper.setWidth(15);
        paper.setWidth(5);
        paper.setLength(30);

        System.out.println("Width = " + paper.getWidth());
        System.out.println("Length = " + paper.getLength());
        System.out.println("Area = " + paper.getArea());

    }

}
