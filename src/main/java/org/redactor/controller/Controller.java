package org.redactor.controller;


import org.redactor.controller.action.ActionDraw;
import org.redactor.controller.action.ActionInterface;
import org.redactor.model.Model;
import org.redactor.model.Shape;
import org.redactor.view.MyFrame;
import org.redactor.view.MyPanel;

import java.awt.*;
import java.util.Collection;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    Model model;
    State state;

    public Controller(){
        model = new Model();
        state = new State(model);
        model.setCurrentShape(new Shape());
        panel = new MyPanel(this);
        frame = new MyFrame(panel,state);

    }

    public void mousePressed(Point point) {
        state.getActionInterface().mousePressed(point);
    }

    public void mouseDragged(Point point) {
        state.getActionInterface().mouseDragget(point);
    }
    public Collection<Shape> translate () {
        return model.getList();
    }

}
