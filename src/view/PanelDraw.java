package view;

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
        this.add(this.panelTittle, BorderLayout.PAGE_START);
        this.add(this.automataDraw, BorderLayout.CENTER);
    }
    private void panelDrawInstances() {
        this.panelTittle = new PanelTittle();
        this.automataDraw = new AutomataDraw();
    }

}
