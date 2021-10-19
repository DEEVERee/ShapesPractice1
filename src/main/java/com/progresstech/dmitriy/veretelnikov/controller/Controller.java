package com.progresstech.dmitriy.veretelnikov.controller;

import com.progresstech.dmitriy.veretelnikov.models.Circle;
import com.progresstech.dmitriy.veretelnikov.models.Rectangle;
import com.progresstech.dmitriy.veretelnikov.models.Shape;
import com.progresstech.dmitriy.veretelnikov.models.Triangle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Controller {

    public static Shape[] initialization() {
        Shape[] array = new Shape[10];
        array[0] = new Rectangle(5, 6, "red");
        array[1] = new Triangle(5, 6, 7, "green");
        array[2] = new Circle(3, "black");
        array[3] = new Rectangle(30, 24.5, "yellow");
        array[4] = new Circle(15, "violet");
        array[5] = new Triangle(4, 5, 6, "pink");
        array[6] = new Triangle(12, 15, 17, "orange");
        array[7] = new Circle(3, "grey");
        array[8] = new Rectangle(7.5, 10.3, "brown");
        array[9] = new Circle(5.5, "blue");
        return array;
    }

    public static void printArray(Shape[] array) {
        int count = 1;
        for (Shape s : array) {
            System.out.print(count + ". ");
            System.out.println(s);
            count++;
        }
    }

    public static double sumOfAllAreas(Shape[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].calcArea();
        }
        return sum;
    }

    public static double sumOfCertainShapeAreas(Class<? extends Shape> cls, Shape[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getClass() == cls) {
                sum += array[i].calcArea();
            }
        }
        return sum;
    }

    public static void sortByAreas(Shape[] array) {
        List<Shape> list = Arrays.asList(array);
        Collections.sort(list, new AreasComparator());
        printList(list);
    }

    public static void sortByShapeColor(Shape[] array) {
        List<Shape> list = Arrays.asList(array);
        Collections.sort(list, new ColorComparator());
        printList(list);
    }

    private static void printList(List<Shape> list) {
        for (Shape s : list) {
            System.out.print(s);
            System.out.println(s.calcArea());
        }
    }

}
