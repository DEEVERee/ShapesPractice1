package com.progresstech.dmitriy.veretelnikov.models;


public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String shapeColor) {
        super(shapeColor);
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {

        return "Rectangle[" +
                "length= " + length +
                ", width= " + width +
                ", shapeColor= " + getShapeColor() +
                "] ";
    }

    @Override
    public void draw() {

    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive!");
        } else {
            this.length = length;
        }
    }


    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive!");
        } else {
            this.width = width;
        }
    }
}
