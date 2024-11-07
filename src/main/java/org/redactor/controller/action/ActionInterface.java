package org.redactor.controller.action;

import org.redactor.model.Model;
import org.redactor.model.Shape;

import java.awt.*;


public interface ActionInterface {
    void mousePressed(Point point);

    void mouseDragget (Point point);

    void setModel(Model m);

    void setSampleShape(Shape myShape);
}
