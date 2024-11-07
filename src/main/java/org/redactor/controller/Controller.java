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
    ActionInterface actionInterface;
    public Controller(){
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        model = new Model();
        model.setCurrentShape(new Shape());
        actionInterface =  new ActionDraw(model);
        frame.setController(this);

    }
    public ActionInterface setActionInterface(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
        actionInterface.setModel(model);
        return actionInterface;
    }
    public void mousePressed(Point point) {
        actionInterface.mousePressed(point);
    }

    public void mouseDragged(Point point) {
        actionInterface.mouseDragget(point);
    }
    public Collection<Shape> translate () {
        return model.getList();
    }

}
