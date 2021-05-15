package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class PanelTittle extends JPanel {

    private JLabel mainTitle;
    private JLabel secondTittle;

    public PanelTittle() {
        this.panelTittleInstances();
        this.panelTittleFeatures();
        this.panelTittleInternalContent();
    }

    private void panelTittleFeatures() {
        this.setOpaque(false);
        this.setLayout(new GridLayout(2,1));
    }
    private void panelTittleInternalContent() {
        this.add(this.mainTitle);
        this.add(this.secondTittle);
    }
    private void panelTittleInstances() {
        this.mainTitle = mainTitleFeautures();
        this.secondTittle = secondTittleFeatures();
    }

    private JLabel mainTitleFeautures() {
        JLabel mainTitle = new JLabel();
        mainTitle.setText("GENERANDO");
        mainTitle.setForeground(Color.decode(Constants.TITTLE_COLOR));
        mainTitle.setFont(Constants.fontProject(Font.BOLD, 85));
        mainTitle.setHorizontalAlignment(JLabel.CENTER);
        return  mainTitle;
    }

    private JLabel secondTittleFeatures() {
        JLabel secondTittle = new JLabel();
        secondTittle.setText("AUTOMATAS");
        secondTittle.setForeground(Color.WHITE);
        secondTittle.setFont(Constants.fontProject(Font.PLAIN, 70));
        secondTittle.setHorizontalAlignment(JLabel.CENTER);
        return  secondTittle;
    }



}
