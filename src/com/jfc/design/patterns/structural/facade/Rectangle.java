package com.jfc.design.patterns.structural.facade;

import com.jfc.design.patterns.structural.facade.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}