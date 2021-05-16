package view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPanel extends JPanel {

    private DataPanel dataPanel;
    private PanelDraw panelDraw;
    private Image resizeImage;


    public MainPanel(ActionListener actionListener) {
        this.mainPanelInstances(actionListener);
        this.mainPanelFeatures();
        this.mainPanelInternalContent();
    }

    public void mainPanelFeatures() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.decode("#FAFAFA"));
    }

    public void mainPanelInstances(ActionListener actionListener) {
        this.backGroundImage();
        this.dataPanel = new DataPanel(actionListener);
        this.panelDraw = new PanelDraw();
    }


    public void mainPanelInternalContent() {
        this.add(this.panelDraw, BorderLayout.CENTER);
        this.add(this.dataPanel, BorderLayout.LINE_END);
    }

    private ImageIcon backGroundImage(){
        ImageIcon backGroundImage = new ImageIcon(getClass().getResource("/images/background.jpg"));
        this.resizeImage = backGroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        return backGroundImage;
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(resizeImage, 0, 0, this);
    }

}
