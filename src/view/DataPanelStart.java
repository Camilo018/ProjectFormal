package view;

import controller.MainActivity;
import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DataPanelStart extends JPanel {

    private JPanel actionSelected;
    private PanelInfo panelInfo;
    private ButtonBound buttonAdd;
    private ButtonBound buttonDelete;
    private  JScrollPane scrollInfo;

    public DataPanelStart(ActionListener actionListener) {
        this.dataPanelStartFeatures();
        this.dataPanelStartInstances(actionListener);
        this.dataPanelStartInternalContent();
    }

    private void dataPanelStartInternalContent() {
        this.actionSelectedInternalContent();
        this.add(Constants.insidePanel(this.actionSelected, 15,20,10,20, "#000000", false), BorderLayout.PAGE_START);
        this.add(Constants.insidePanel(this.scrollInfo, 15,20,0,20, "#000000", false), BorderLayout.CENTER);
    }

    private void actionSelectedInternalContent() {
        this.actionSelected.add(Constants.insidePanel(this.buttonAdd, 0,0,0,10,"#000000", false));
        this.actionSelected.add(Constants.insidePanel(this.buttonDelete, 0,0,0,0,"#000000", false));
    }

    private void dataPanelStartInstances(ActionListener actionListener) {
        this.scrollInfo = scrollInfo();
        this.panelInfo = new PanelInfo();
        this.actionSelected = this.actionSelected();
        this.buttonAdd = this.buttonAdd(actionListener);
        this.buttonDelete = this.buttonDelete(actionListener);
    }

    private JScrollPane scrollInfo() {
        JScrollPane scrollPane = new JScrollPane(panelInfo);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        return scrollPane;
    }

    private ButtonBound buttonDelete(ActionListener actionListener) {
        ButtonBound buttonDelete = new ButtonBound("Eliminar", actionListener, MainActivity.DELETE_ELEMENT.toString());
        return buttonDelete;
    }

    private ButtonBound buttonAdd(ActionListener actionListener) {
        ButtonBound buttonAdd = new ButtonBound("Añadir", actionListener, MainActivity.ADD_ELEMENT.toString());
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
