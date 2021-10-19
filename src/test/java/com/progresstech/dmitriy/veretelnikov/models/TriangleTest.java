package com.progresstech.dmitriy.veretelnikov.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private static Triangle triangle;

    @Test
    @DisplayName("Arguments are int values")
    void triangle1() {
        triangle = new Triangle(4, 7, 5, "blue");

        int actual = (int) triangle.calcArea();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arguments are double values")
    void triangle2() {
        triangle = new Triangle(4.4, 7.8, 12, "blue");

        double actual = triangle.calcArea();
        double expected = 6.329541847558941;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check for real triangle according to its sides")
    void triangle3() {
        try {
            triangle = new Triangle(3, 8, 4, "blue");
            fail();
        } catch (IllegalArgumentException ex) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }

    @Test
    @DisplayName("Check for null arguments")
    void triangle4() {
        try {
            triangle = new Triangle(7, 8, 0, "blue");
            fail();
        } catch (IllegalArgumentException ex) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }
}