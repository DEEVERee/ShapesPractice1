package com.progresstech.dmitriy.veretelnikov.view;

import com.progresstech.dmitriy.veretelnikov.controller.Controller;
import com.progresstech.dmitriy.veretelnikov.models.Circle;
import com.progresstech.dmitriy.veretelnikov.models.Rectangle;
import com.progresstech.dmitriy.veretelnikov.models.Shape;
import com.progresstech.dmitriy.veretelnikov.models.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shape[] array = Controller.initialization();

        String menu = """
                                МЕНЮ:
                1. Відобразити всі додані фігури;
                2. Обчислити сумарну площу всіх фігур;
                3. Обчислити сумарну площу фігур заданого виду;
                4. Впорядкувати набір даних щодо збільшення площі фігури; 
                5. Впорядкувати набір даних за кольором фігур.
                0. Вихід.
                 """;
        String shapes = """
                1. Rectangle;
                2. Triangle;
                3. Circle;
                0. Return to the menu.
                """;

        boolean check = true;
        while (check) {
            System.out.println(menu + "Choose any item in the menu:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case (1):
                    Controller.printArray(array);
                    break;
                case (2):
                    System.out.println("Sum of all shapes' areas");
                    System.out.println(Controller.sumOfAllAreas(array));
                    break;
                case (3):
                    System.out.println(shapes + "Choose any kind of shape:");
                    Scanner chooseShape = new Scanner(System.in);
                    int shape = chooseShape.nextInt();
                    if (shape == 1) {
                        System.out.println("Sum of areas of all rectangles.");
                        System.out.println(Controller.sumOfCertainShapeAreas(Rectangle.class, array));
                    } else if (shape == 2) {
                        System.out.println("Sum of areas of all triangles.");
                        System.out.println(Controller.sumOfCertainShapeAreas(Triangle.class, array));
                    } else if (shape == 3) {
                        System.out.println("Sum of areas of all circles.");
                        System.out.println(Controller.sumOfCertainShapeAreas(Circle.class, array));
                    }
                    break;
                case (4):
                    System.out.println("Sorting by area");
                    Controller.sortByAreas(array);
                    break;
                case (5):
                    System.out.println("Sorting by color");
                    Controller.sortByShapeColor(array);
                    break;
                case (0):
                    check = false;
                    break;
                default:
                    System.out.println("No such menu item! Try it again!");
                    break;
            }
        }
    }
}

