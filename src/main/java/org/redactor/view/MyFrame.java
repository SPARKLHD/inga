package org.redactor.view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame(MyPanel panel) throws HeadlessException {
        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
        setResizable(false);
//        setLocationRelativeTo(null);
    }
}
