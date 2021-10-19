package com.progresstech.dmitriy.veretelnikov.models;


public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String shapeColor) {
        super(shapeColor);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        conclusion();
    }

    @Override
    public double calcArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "Triangle[" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                ", shapeColor= " + getShapeColor() +
                "] ";
    }

    private void setSide1(double side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("The side1 must be positive!");
        } else {
            this.side1 = side1;
        }
    }

    private void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("The side2 must be positive!");
        } else {
            this.side2 = side2;
        }
    }

    private void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("The side3 must be positive!");
        } else {
            this.side3 = side3;
        }
    }

    private static boolean isReal(double side1, double side2, double side3) {
        if (side1 + side2 <= side3) {
            return false;
        } else if (side1 + side3 <= side2) {
            return false;
        } else if (side2 + side3 <= side1) {
            return false;
        }
        return true;
    }

    private void conclusion() {
        boolean result = isReal(side1, side2, side3);
        if (!result) {
            throw new IllegalArgumentException("This triangle is not real!");
        }
    }

}
