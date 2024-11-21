package org.redactor.view.menu;

import org.redactor.controller.State;

import javax.swing.*;
import java.awt.*;

public class SwitchColor implements Command{
    State state;
    Color c;

    public SwitchColor(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        c = JColorChooser.showDialog(null, "Menu color", c.BLUE);
        state.setColor(c);
    }

}
