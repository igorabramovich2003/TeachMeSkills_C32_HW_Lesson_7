package com.teachmeskills.lesson7.task2.figure;

import com.teachmeskills.lesson7.task2.circle.Circle;
import com.teachmeskills.lesson7.task2.rectangle.Rectangle;
import com.teachmeskills.lesson7.task2.triangle.Triangle;

/**
 * 2. Write a hierarchy of classes Shape, Triangle, Rectangle, Circle.
 * Implement a function to calculate the area for each type of shape and calculate the perimeter (using an abstract class/methods).
 * Create an array of 5 different shapes.
 * Loop through the array and display information about each shape.
 * Display the sum of the perimeters of all shapes in the array.
 */

public class FigureShow {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(9);
        figures[1] = new Triangle(10, 15, 10);
        figures[2] = new Rectangle(7, 9);
        figures[3] = new Triangle(8, 13, 10);
        figures[4] = new Rectangle(4, 11);

        double totalArea = 0;
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            figure.print();
            System.out.println();
            totalArea += figure.area();
            totalPerimeter += figure.perimeter();
        }
        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);

    }
}
