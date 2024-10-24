package org.redactor.controller;

import org.redactor.model.Model;
import org.redactor.view.MyFrame;
import org.redactor.view.MyPanel;

import java.awt.*;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    Model model;
    Point[] points;
    public Controller(){
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        model = new Model(0);
    }
    public void mousePressed(Point point) {
        points[0]=point;
    }

    public void mouseDragged(Point point) {
        points[1]=point;
        model.setFrame(points);
    }
}
