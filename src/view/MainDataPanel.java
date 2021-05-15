package view;

import keeptoo.KGradientPanel;
import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class MainDataPanel extends KGradientPanel {


    public MainDataPanel() {
        this.mainDataPanelFeatures();
        this.mainDataPanelInstances();
        this.mainDataPanelInternalContent();
    }

    private void mainDataPanelFeatures() {
        setOpaque(false);
        setPreferredSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
        setMaximumSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
        setMinimumSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
    }

    private void mainDataPanelInstances() {

    }

    private void mainDataPanelInternalContent() {
        this.setkStartColor(Color.decode("#19395F"));
        this.setkEndColor(Color.decode("#01C8E4"));
        this.setkGradientFocus(-1500);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Yellow is the clipped area.
        g2d.setColor(Color.yellow);
        g2d.fillRoundRect(0, 0, Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE, 25, 25);
        g2d.setComposite(AlphaComposite.Src);



    }
}

