package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DataPanel extends JPanel {

    private MainDataPanel mainDataPanel;


    public DataPanel(ActionListener actionListener) {
        this.dataPanelInstances(actionListener);
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


    private void dataPanelInstances(ActionListener actionListener) {
        this.mainDataPanel = new MainDataPanel(actionListener);
    }




}
