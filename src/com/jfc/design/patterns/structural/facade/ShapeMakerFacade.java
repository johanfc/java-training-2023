package com.jfc.design.patterns.structural.facade;

import com.jfc.design.patterns.structural.facade.Circle;
import com.jfc.design.patterns.structural.facade.Rectangle;
import com.jfc.design.patterns.structural.facade.Shape;
import com.jfc.design.patterns.structural.facade.Square;

public class ShapeMakerFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
