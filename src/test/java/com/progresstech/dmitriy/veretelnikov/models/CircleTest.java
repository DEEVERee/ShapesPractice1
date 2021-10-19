package com.progresstech.dmitriy.veretelnikov.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private static Circle circle;

    @Test
    @DisplayName("Arguments is int value")
    void circle1() {
        circle = new Circle(4, "black");

        double actual = circle.calcArea();
        double expected = 50.26548245743669;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arguments is double value")
    void circle2() {
        circle = new Circle(12.5, "black");

        double actual = circle.calcArea();
        double expected = 490.8738521234052;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check for exception, if the radius is zero or negative.")
    void circle3() {
        try {
            circle = new Circle(-3, "black");
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }
}