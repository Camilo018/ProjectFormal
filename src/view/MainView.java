package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainView extends JFrame {

    private MainPanel mainPanel;

    public MainView(ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) throws HeadlessException {
        this.mainViewInstances(states, alphabet, actionListener);
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

    private void mainViewInstances (ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) {
        this.mainPanel = new MainPanel(states, alphabet, actionListener);
    }

    private void mainViewInternalContent () {
        this.add(this.mainPanel, BorderLayout.CENTER);
    }

    public void addElement() {
        this.mainPanel.addElement();
    }

    public void initialState() {
        this.mainPanel.initialState();
    }

    public void finalState() {
        this.mainPanel.finalState();
    }
}
