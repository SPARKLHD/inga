package org.redactor.controller;

import org.redactor.controller.action.ActionDraw;
import org.redactor.controller.action.ActionInterface;

import org.redactor.model.Shape;
import org.redactor.model.Model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class State {
    Shape Shape;
    Model model;
    ActionInterface actionInterface;
    public State(Model model) {
        this.model = model;
        actionInterface = new ActionDraw(model);
        Shape = new Shape(Color.BLUE,new Ellipse2D.Double());
    }

    public void setRectangularShape(RectangularShape shape) {
        //this.shape = shape;
        Shape.setShape(shape);
        actionInterface.setSampleShape(Shape);
    }
    public void setActionInterface(ActionInterface b) {
        actionInterface = b;
        actionInterface.setModel(model);

    }

    public ActionInterface getActionInterface() {
        return actionInterface;
    }

    public void setColor(Color c) {
        Shape.setcolor(c);
        actionInterface.setSampleShape(Shape);
    }
}
