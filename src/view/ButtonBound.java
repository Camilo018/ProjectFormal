package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonBound extends JButton {

    public ButtonBound(String textBoton, ActionListener actionListener, String actionCommand) {
        this.setFont(Constants.fontProject(Font.PLAIN, 16));
        this.setText(textBoton);
        this.setBorderPainted(true);
        this.setActionCommand(actionCommand);
        this.addActionListener(actionListener);
    }



}
