package com.teachmeskills.lesson7.task2.rectangle;

import com.teachmeskills.lesson7.task2.figure.Figure;

public class Rectangle extends Figure {
    private double height, width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
