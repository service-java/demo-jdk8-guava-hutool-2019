package com.wiley.javainterviewsexposed.chapter08;

public class Rectangle {

    private final int width;
    private final int height;

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}
