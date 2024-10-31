package org.redactor.controller;


import  org.redactor.view.MyFrame;
import org.redactor.view.MyPanel;
import org.redactor. model.Model;
import org.redactor.model.Shape;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.Collection;
public class Controller {
    MyFrame frame;
    MyPanel panel;
    Model model;
    Point2D[] points;
    public Controller(){
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        model = Model.getInstance();
        points = new Point2D[2];
        model.setCurrentShape(new Shape());
    }
    public void mousePressed(Point point) {
        points[0]=point;
        model.addShape(points);
    }

    public void mouseDragged(Point point) {
        points[1]=point;
        model.setFrame(points);
    }
    public Collection<Shape> translate () {
        return model.getList();
    }

}
