package org.redactor.view.menu;

import org.redactor.controller.State;
import org.redactor.controller.action.ActionInterface;

public class SwitchAction implements Command{
    State state;
    ActionInterface actionInterface;

    public SwitchAction(State state, ActionInterface ab) {
        this.state = state;
        this.actionInterface = ab;
    }

    @Override
    public void execute() {
        state.setActionInterface(actionInterface);
    }
}

