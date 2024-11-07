package org.redactor.controller.action;

import org.redactor.model.Model;
import org.redactor.model.Shape;



import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.*;
public class ActionDraw implements ActionInterface {
    Shape sampleShape;
    Shape shape;
    Point2D[] p;
    Model model;
    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    public void setSampleShape(Shape sampleShape) {
        this.sampleShape = sampleShape;
    }

    public ActionDraw() {

        p = new Point2D[2];
        sampleShape = new Shape(Color.BLUE, new Ellipse2D.Double());
    }

    public ActionDraw (Model model) {
        shape = new Shape();
        this.p = new Point2D[2];
        this.model = model;
        sampleShape = new Shape(Color.BLUE, new Ellipse2D.Double());
    }

    public void setShapes(Shape shape) {
        this.shape = shape;
    }
    public void stretchShape(Point2D point){
        p[1] = point;
        shape.setFrame(p);
    }
    public void createShape(Point2D point){
        p[0] = point;
        shape = sampleShape.clone();
        model.addShape(shape);
    }

    @Override
    public void mousePressed(Point point) {
        createShape(point);
    }

    @Override
    public void mouseDragget(Point point) {
        stretchShape(point);
    }



}
