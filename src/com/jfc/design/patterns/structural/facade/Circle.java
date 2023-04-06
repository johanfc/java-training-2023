package com.jfc.design.patterns.structural.facade;

import com.jfc.design.patterns.structural.facade.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}