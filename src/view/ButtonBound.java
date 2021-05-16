package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class ButtonBound extends JButton {

<<<<<<< HEAD
    public ButtonBound(String textBoton, ActionListener actionListener, String actionCommand) {
=======
    public ButtonBound(String textBoton) {
>>>>>>> 6503ca7608f99f62a997cd06eaeb812fc27545cc
        this.setFont(Constants.fontProject(Font.PLAIN, 16));
        this.setText(textBoton);
        this.setBorderPainted(true);
        this.setActionCommand(actionCommand);
        this.addActionListener(actionListener);
    }



}
