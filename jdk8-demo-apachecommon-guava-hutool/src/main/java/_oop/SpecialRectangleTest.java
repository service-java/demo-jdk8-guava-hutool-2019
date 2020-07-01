package _oop;

import entity.poly.SpecialRectangleEntity;

public class SpecialRectangleTest {

    public static void main(String[] args) {
        SpecialRectangleEntity paper = new SpecialRectangleEntity();

        paper.setWidth(15);
        paper.setWidth(5);
        paper.setLength(30);

        System.out.println("Width = " + paper.getWidth());
        System.out.println("Length = " + paper.getLength());
        System.out.println("Area = " + paper.getArea());

    }

}
