package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class ButtonBound extends JButton {

    public ButtonBound(String textBoton) {
        this.setFont(Constants.fontProject(Font.PLAIN, 16));
        this.setText(textBoton);
        this.setBorderPainted(true);
    }



}
