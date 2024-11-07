package org.redactor.controller.action;

import org.redactor.model.Model;
import org.redactor.model.Shape;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Collection;

public class ActionMove implements ActionInterface {
    Shape shape;
    Point2D[] p;
    Model model;

    public ActionMove(Model model) {
        this.model = model;
        p = new Point2D[2];
    }

    public ActionMove() {

        p = new Point2D[2];
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void setSampleShape(Shape myShape) {

    }

    void findShape(Point point) {
        Point2D p1 =point;
        p[0] = p1;
        Collection<Shape> list = model.getList();
        for (Shape x : list) {
            if (x.getShape().contains(p1)) shape = x;
        }
    }

    @Override
    public void mousePressed(Point point) {
        findShape(point);
    }

    public void moveShape(Point point) {
        p[1] = point;
        if (shape != null) {
            double deltaX = p[1].getX() - p[0].getX();
            double deltaY = p[1].getY() - p[0].getY();
            double maxX = shape.getShape().getMaxX() + deltaX;
            double maxY = shape.getShape().getMaxY() + deltaY;
            double minX = shape.getShape().getMinX() + deltaX;
            double minY = shape.getShape().getMinY() + deltaY;
            shape.getShape().setFrameFromDiagonal(minX, minY, maxX, maxY);
            p[0] = p[1];
        }
    }

    @Override
    public void mouseDragget(Point point) {
        moveShape(point);

    }



}