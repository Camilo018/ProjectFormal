package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private MainPanel mainPanel;

    public MainView(ActionListener actionListener) throws HeadlessException {
        this.mainViewInstances(actionListener);
        this.mainViewFeatures();
        this.mainViewInternalContent();
        this.setVisible(true);
    }

    private void mainViewFeatures () {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(Constants.MIN_WIDTH, Constants.MIN_HEIGHT));
        this.setBackground(Color.decode("#FAFAFA"));
        this.setDefaultLookAndFeelDecorated(true);
        this.setTitle("Automatas finitos no deterministas");

    }

    private void mainViewInstances (ActionListener actionListener) {
        this.mainPanel = new MainPanel(actionListener);
    }

    private void mainViewInternalContent () {
        this.add(this.mainPanel, BorderLayout.CENTER);
    }
}
