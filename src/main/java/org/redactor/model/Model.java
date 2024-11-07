package org.redactor.model;


import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
    Shape currentShape;
    Collection<Shape> list;
    private static Model model = null;
    public Model(){

        list = new ArrayList<>();
    }


    public static Model getInstance(){
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public void addShape(Shape shape){
        currentShape = shape ;
        list.add(currentShape);
    }
    public void setCurrentShape(Shape currentShape) {

        this.currentShape = currentShape;
    }
    public Shape getCurrentShape() {

        return currentShape;
    }

    public Collection<Shape> getList() {

        return list;
    }


    public void setFrame(Point2D[] points) {

        currentShape.addShape(points);
    }
}
