package com.progresstech.dmitriy.veretelnikov.models;


public abstract class Shape implements Drawable {
    private String shapeColor;

    protected Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape[" +
                "shapeColor= " + shapeColor + '\'' +
                ']';
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
