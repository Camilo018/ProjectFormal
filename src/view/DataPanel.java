package view;

import keeptoo.KGradientPanel;
import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {

    private MainDataPanel mainDataPanel;

    public DataPanel() {
        this.dataPanelInstances();
        this.dataPanelFeatures();
        this.dataPanelInternalContent();
    }

    private void dataPanelFeatures() {
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
    }

    private void dataPanelInternalContent() {
        this.add(Constants.insidePanel(this.mainDataPanel, 80, 30, 80, 30, "#000000", false), BorderLayout.CENTER);
    }


    private void dataPanelInstances() {
        this.mainDataPanel = new MainDataPanel();
    }




}
