package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class RectangleList {

    @Test
    public void polymorphicList() {
        List<Rectangle> rectangles = new ArrayList<>(3);
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(2, 10));
        rectangles.add(new Square(9));

        assertEquals(rectangles.get(0).area(), 5);
        assertEquals(rectangles.get(1).area(), 20);
        assertEquals(rectangles.get(2).area(), 81);
    }

}
