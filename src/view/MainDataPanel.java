package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class MainDataPanel extends JPanel {

    private ImageIcon backGroundImage;
    private Image resizeImage;
    private  DataPanelStart dataPanelStart;
    private DataPanelEnd dataPanelEnd;


    public MainDataPanel(ActionListener actionListener) {
        this.mainDataPanelFeatures();
        this.mainDataPanelInstances(actionListener);
        this.mainDataPanelInternalContent();
    }

    private void mainDataPanelFeatures() {
        this.setPreferredSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
        this.setMaximumSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
        this.setMinimumSize(new Dimension(Constants.MIN_WIDTH_PHONE, Constants.MIN_HEIGHT_PHONE));
        this.setLayout(new GridLayout(2,1));
        this.setOpaque(false);
    }

    private void mainDataPanelInstances(ActionListener actionListener) {
        this.backGroundImage = backGroundImage();
        this.dataPanelStart = new DataPanelStart(actionListener);
        this.dataPanelEnd = new DataPanelEnd(actionListener);
    }

    private void mainDataPanelInternalContent() {
        this.add(Constants.insidePanel(this.dataPanelStart, 30, 20, 0, 20, "#000000", false));
        this.add(Constants.insidePanel(this.dataPanelEnd, 0, 20, 30, 20, "#000000", false));
    }

    private ImageIcon backGroundImage(){
        ImageIcon backGroundImage = new ImageIcon(getClass().getResource("/images/backgroundTwo.jpg"));
        this.resizeImage = backGroundImage.getImage().getScaledInstance(660, 890, Image.SCALE_SMOOTH);
        return backGroundImage;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Paint oldPaint = fillReact(g2);
        this.strokeFeatures(g2);
        g2.setPaint(oldPaint);
        graphics.drawImage(this.resizeImage, 0, 0, this);
    }



    private Paint fillReact(Graphics2D g2) {
        Paint oldPaint = g2.getPaint();
        RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(
                0,0,getWidth(),getHeight()-1,50,50);
        g2.clip(r2d);
        g2.setPaint(new GradientPaint(0.0f, 0.0f, Color.decode("#19355F").darker(),
                0.0f, getHeight(),Color.decode("#01C8E4").darker()));
        g2.fillRect(0,0,getWidth(),getHeight());
        return oldPaint;
    }

    private void strokeFeatures(Graphics2D g2) {
        g2.setStroke(new BasicStroke(4f));
        g2.setPaint(new GradientPaint(0.0f, 0.0f,Color.white,
                0.0f, getHeight(), Color.white));
        g2.drawRoundRect(0, 0, getWidth()-2 , getHeight() -2, 18, 18);
    }
}

