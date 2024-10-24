package org.redactor.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class Model {
    RectangularShape currentShape;
    public Model(int i){
        currentShape  = new Ellipse2D.Double();
    }
    public void setFrame(Point[] points) {
        currentShape.setFrameFromDiagonal(points[0], points[1]);
    }
    public Shape getShape() {
        return currentShape;
    }
}
