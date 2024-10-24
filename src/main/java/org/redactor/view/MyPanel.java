package org.redactor.view;

import org.redactor.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    private Controller controller;
    Point2D[] points;
    RectangularShape shape;

    public MyPanel( Controller controller) {
        points = new Point2D[2];
        shape = new Ellipse2D.Double();
        this.controller = controller;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                controller.mousePressed(e.getPoint());
//                points[0]=e.getPoint();
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                controller.mouseDragged(e.getPoint());
//                points[1]=e.getPoint();
//                shape.setFrameFromDiagonal(points[0],points[1]);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        ArrayList<RectangularShape> shapes = controller.translate();
        if (shapes != null) {
            for (RectangularShape x : shapes)
                g2.draw(x);
        }
    }

}
