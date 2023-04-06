package com.jfc.design.patterns.structural.facade;

import com.jfc.design.patterns.structural.facade.ShapeMakerFacade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}