package com.progresstech.dmitriy.veretelnikov.controller;

import com.progresstech.dmitriy.veretelnikov.models.Shape;

import java.util.Comparator;

public class AreasComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        return (int) (s1.calcArea() - s2.calcArea());
    }
}
