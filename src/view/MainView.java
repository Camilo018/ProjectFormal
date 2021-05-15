package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    public MainView() throws HeadlessException {


    }

    private void mainViewFeatures () {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(Constants.MIN_WIDTH, Constants.MIN_HEIGHT));
        this.setFont(Constants.fontProject());
    }

    private void mainViewInstances () {

    }

    private void mainViewInternalContent () {

    }
}
