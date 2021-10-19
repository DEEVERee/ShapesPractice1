package com.progresstech.dmitriy.veretelnikov.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private static Rectangle rectangle;


    @Test
    @DisplayName("Arguments are int values")
    void rectangle1() {
        rectangle = new Rectangle(4, 5, "black");

        double actual = rectangle.calcArea();
        double expected = 20;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Arguments are double values")
    void rectangle2() {
        rectangle = new Rectangle(2.5, 8.5, "black");

        double actual = rectangle.calcArea();
        double expected = 21.25;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check for exception, if one of the arguments is zero or negative.")
    void rectangle3() {
        try {
            rectangle = new Rectangle(0, 4, "black");
            fail();     //if the method doesn't throw the exception, fail method will crush the test
        } catch (IllegalArgumentException e) {
        }
    }
}