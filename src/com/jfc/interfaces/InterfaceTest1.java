package com.jfc.interfaces;// Java program to illustrate the
// concept of interface
//https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/?ref=lbp

interface Shape {
    // abstract method
    void draw();
    double area();
    String toStringShape();
}

class Rectangle implements Shape {
    int length, width;

    // constructor
    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }

    @Override public double area()
    {
        return (double)(length * width);
    }

    @Override
    public String toStringShape() {
        return null;
    }
}

class Circle implements Shape {

    double pi = 3.14;
    int radius;

    // constructor
    Circle(int radius) { this.radius = radius; }

    @Override public void draw()
    {
        System.out.println("Circle has been drawn ");
    }

    @Override public double area()
    {

        return (double)((pi * radius * radius) / 2);
    }

    @Override
    public String toStringShape() {
        return null;
    }
}

class GFGIfx {
    public static void main(String[] args)
    {

        // creating the Object of Rectangle class
        // and using shape interface reference.
        Shape rect = new Rectangle(2, 3);
        System.out.println("Area of rectangle: "
                + rect.area());

        // creating the Objects of circle class
        Shape circle = new Circle(2);
        System.out.println("Area of circle: "
                + circle.area());
    }
}

