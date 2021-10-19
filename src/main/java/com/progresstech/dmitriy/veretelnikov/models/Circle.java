package com.progresstech.dmitriy.veretelnikov.models;


public class Circle extends Shape {
    private static final double pi = Math.PI;
    private double radius;

    public Circle(double radius, String shapeColor) {
        super(shapeColor);
        setRadius(radius);
    }


    @Override
    public void draw() {

    }

    @Override
    public double calcArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius= " + radius +
                ", shapeColor= " + getShapeColor() +
                "] ";
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be more than zero!");
        } else {
            this.radius = radius;
        }
    }
}
