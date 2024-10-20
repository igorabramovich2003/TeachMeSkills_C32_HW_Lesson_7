package com.teachmeskills.lesson7.task2.triangle;

import com.teachmeskills.lesson7.task2.figure.Figure;

public class Triangle extends Figure {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double S = p * (p - a) * (p - b) * (p - c);
        if (S >= 0){
            return Math.sqrt(S);
        }else {
            return 0;
        }
    }


    @Override
    public double perimeter() {
        return a + b + c;
    }
}
