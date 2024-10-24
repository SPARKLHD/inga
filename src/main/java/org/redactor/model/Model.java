package org.redactor.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;

public class Model {
    RectangularShape currentShape;
    ArrayList<RectangularShape> list;
    public Model(int i){
        currentShape  = new Ellipse2D.Double();
        list = new ArrayList<>();
    }
    public void addShape() {
        currentShape = (RectangularShape) currentShape.clone();
//        currentShape  = new Ellipse2D.Double();
        list.add(currentShape);
    }
    public void setFrame(Point2D[] points) {
        currentShape.setFrameFromDiagonal(points[0], points[1]);
    }
    public Shape getShape() {
        return currentShape;
    }
    public ArrayList<RectangularShape> getList() {
        return list;
    }
}
