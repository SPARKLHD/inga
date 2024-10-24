package org.redactor.controller;

import org.redactor.model.Model;
import org.redactor.view.MyFrame;
import org.redactor.view.MyPanel;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    Model model;
    Point2D[] points;
    public Controller(){
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        model = new Model(1);
        points = new Point2D[2];
    }
    public void mousePressed(Point point) {
        points[0]=point;
        model.addShape();
    }

    public void mouseDragged(Point point) {
        points[1]=point;
        model.setFrame(points);
    }
    public ArrayList<RectangularShape> translate () {
        return model.getList();
    }
}
