package com.teachmeskills.lesson7.task2.figure;


public abstract class Figure {

    public abstract double area();
    public abstract double perimeter();

    public void print() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
