package org.redactor.view.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SwitchState extends AbstractAction {
    public SwitchState(String name, Icon icon,Command com) {
        super(name, icon);
        putValue("Command",com);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Command command  = (Command) getValue("Command");
        command.execute();
    }
}
