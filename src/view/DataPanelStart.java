package view;

import controller.MainActivity;
import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DataPanelStart extends JPanel {

    private PanelInfo panelInfo;
    private ButtonBound buttonBoundValidate;

    public DataPanelStart(ActionListener actionListener) {
        this.dataPanelStartFeatures();
        this.dataPanelStartInstances(actionListener);
        this.dataPanelStartInternalContent();
    }

    private void dataPanelStartInternalContent() {
        this.add(Constants.insidePanel(this.buttonBoundValidate, 20,100,0,100, "#000000", false), BorderLayout.PAGE_START);
        this.add(Constants.insidePanel(this.panelInfo, 0,20,0,20, "#000000", false), BorderLayout.CENTER);
    }



    private void dataPanelStartInstances(ActionListener actionListener) {
        this.buttonBoundValidate = this.buttonBoundValidate(actionListener);
        this.panelInfo = new PanelInfo();
    }

    private ButtonBound buttonBoundValidate(ActionListener actionListener) {
        ButtonBound buttonBound = new ButtonBound("Validar palabra", actionListener, MainActivity.VALIDATE_WORD.toString());
        return  buttonBound;
    }


    private void dataPanelStartFeatures() {
        this.setOpaque(false);
        this.setLayout(new BorderLayout());
    }

    public void addElement(ArrayList<String[]> element) {
        this.panelInfo.addElement(element);
    }
}
