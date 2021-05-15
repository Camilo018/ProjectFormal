package view;

import keeptoo.KGradientPanel;
import utils.Constants;

import java.awt.*;

public class MainPanel extends KGradientPanel {

    private DataPanel dataPanel;
    private PanelDraw panelDraw;

    public MainPanel() {
        this.mainPanelInstances();
        this.mainPanelFeatures();
        this.mainPanelInternalContent();
    }

    public void mainPanelFeatures() {
        this.setLayout(new BorderLayout());
        this.setkStartColor(Color.decode(Constants.START_COLOR));
        this.setkEndColor(Color.decode(Constants.END_COLOR));
        this.setkGradientFocus(500);
    }

    public void mainPanelInstances() {
        this.dataPanel = new DataPanel();
        this.panelDraw = new PanelDraw();
    }

    public void mainPanelInternalContent() {
        this.add(this.panelDraw, BorderLayout.CENTER);
        this.add(this.dataPanel, BorderLayout.LINE_END);
    }

}
