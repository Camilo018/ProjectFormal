package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class DataPanelStart extends JPanel {

    private JPanel actionSelected;
    private PanelInfo panelInfo;
    private ButtonBound buttonAdd;
    private ButtonBound buttonDelete;

    public DataPanelStart() {
        this.dataPanelStartFeatures();
        this.dataPanelStartInstances();
        this.dataPanelStartInternalContent();
    }

    private void dataPanelStartInternalContent() {
        this.actionSelectedInternalContent();
        this.add(Constants.insidePanel(this.actionSelected, 15,20,10,20, "#000000", false), BorderLayout.PAGE_START);
        this.add(Constants.insidePanel(this.panelInfo, 15,20,0,20, "#000000", false), BorderLayout.CENTER);
    }

    private void actionSelectedInternalContent() {
        this.actionSelected.add(Constants.insidePanel(this.buttonAdd, 0,0,0,10,"#000000", false));
        this.actionSelected.add(Constants.insidePanel(this.buttonDelete, 0,0,0,0,"#000000", false));
    }

    private void dataPanelStartInstances() {
        this.panelInfo = new PanelInfo();
        this.actionSelected = this.actionSelected();
        this.buttonAdd = this.buttonAdd();
        this.buttonDelete = this.buttonDelete();
    }

    private ButtonBound buttonDelete() {
        ButtonBound buttonDelete = new ButtonBound("Eliminar");
        return buttonDelete;
    }

    private ButtonBound buttonAdd() {
        ButtonBound buttonAdd = new ButtonBound("Añadir");
        return buttonAdd;
    }

    private JPanel actionSelected() {
        JPanel actionSelected = new JPanel(new GridLayout(1,2));
        actionSelected.setOpaque(false);
        return actionSelected;
    }

    private void dataPanelStartFeatures() {
        this.setOpaque(false);
        this.setLayout(new BorderLayout());
    }
}
