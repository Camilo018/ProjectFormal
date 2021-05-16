package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class PanelDraw extends JPanel {

    private PanelTittle panelTittle;
    private AutomataDraw automataDraw;

    public PanelDraw() {
        this.panelDrawInstances();
        this.panelDrawFeatures();
        this.panelDrawInternalContent();
    }

    private void panelDrawFeatures() {
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
    }
    private void panelDrawInternalContent() {
        this.add(Constants.insidePanel(this.panelTittle, 60,0,0,0,"#000000", false), BorderLayout.PAGE_START);
        this.add(this.automataDraw, BorderLayout.CENTER);
    }
    private void panelDrawInstances() {
        this.panelTittle = new PanelTittle();
        this.automataDraw = new AutomataDraw();
    }

}
