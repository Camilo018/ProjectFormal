package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DataPanel extends JPanel {

    private MainDataPanel mainDataPanel;


    public DataPanel(ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) {
        this.dataPanelInstances(states, alphabet, actionListener);
        this.dataPanelFeatures();
        this.dataPanelInternalContent();
    }

    private void dataPanelFeatures() {
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
    }

    private void dataPanelInternalContent() {
        this.add(Constants.insidePanel(this.mainDataPanel, 80, 50, 80, 50, "#000000", false), BorderLayout.CENTER);
    }


    private void dataPanelInstances(ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) {
        this.mainDataPanel = new MainDataPanel(states, alphabet, actionListener);
    }


    public void addElement() {
        this.mainDataPanel.addElement();
    }

    public void initialState() {
        this.mainDataPanel.initialState();
    }

    public void finalState() {
        this.mainDataPanel.finalState();
    }
}
