package org.redactor.model;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class Shape {

    Color color;
    RectangularShape shape;
    FillBehavior fillBehavior;
    public Shape(Color color, RectangularShape shape) {
        this.color = color;
        this.shape = shape;
        this.fillBehavior = FillBehavior.FILL;
    }
    public Shape() {
        color = Color.CYAN;
        shape = new Rectangle2D.Double();
        this.fillBehavior = FillBehavior.FILL;
    }
    public RectangularShape getShape() {
        return shape;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }
    public void addShape(Point2D[] p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }
    public void draw( Graphics2D g){
        Paint paint = g.getPaint();
        g.setColor(color);
        fillBehavior.draw(g,shape);
        g.setPaint(paint);
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public FillBehavior getFillBehavior() {
        return fillBehavior;
    }

    public void setFillBehavior(FillBehavior fillBehavior) {
        this.fillBehavior = fillBehavior;
    }

    public Shape clone() {
        Shape s = new Shape();
        s.setColor(this.color);
        s.fillBehavior = this.fillBehavior;
        s.setShape((RectangularShape) this.shape.clone());
        return s;
    }

    public void setFrame(Point2D[] p) {
        shape.setFrameFromDiagonal(p[0],p[1]);
    }
}
