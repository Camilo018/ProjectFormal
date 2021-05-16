package view;

import controller.MainActivity;
import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class DataPanelEnd extends JPanel {

    private TextFieldBound fieldState;
    private TextFieldBound fieldAlphabet;
    private ButtonBound buttonInitialState;
    private ButtonBound buttonFinalState;
    private ComboBoxBound stateStart;
    private DefaultComboBoxModel stateStartModel;
    private ComboBoxBound stateEnd;
    private DefaultComboBoxModel stateEndModel;
    private ComboBoxBound transition;
    private DefaultComboBoxModel transitionModel;
    private JPanel panelTransition;
    private JPanel typeState;
    private int finalState;
    private int initialState;
    private ButtonBound buttonAdd;
    private ButtonBound buttonDelete;
    private JPanel actionSelected;



    public DataPanelEnd(ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) {
        this.dataPanelEndFeatures();
        this.dataPanelEndInstances(states, alphabet, actionListener);
        this.dataPanelEndInternalContent();
    }

    private void dataPanelEndFeatures () {
        this.setLayout(new GridLayout(6,1 ));
        this.setOpaque(false);
    }

    private void dataPanelEndInstances (ArrayList<String> states, ArrayList<String> alphabet, ActionListener actionListener) {
        this.initialState = 0;
        this.finalState = 0;
        this.stateStartModel = new DefaultComboBoxModel();
        this.stateEndModel = new DefaultComboBoxModel();
        this.transitionModel = new DefaultComboBoxModel();
        this.typeState = this.typeState();
        this.buttonInitialState = this.buttonInitialState(actionListener);
        this.buttonFinalState = this.buttonFinalState(actionListener);
        this.fieldState = this.fieldState();
        this.fieldAlphabet = this.fieldAlphabet();
        this.panelTransition = this.panelTransition();
        this.stateStart = this.stateStart();
        this.stateEnd = this.stateEnd();
        this.transition = this.transition();
        this.actionSelected = this.actionSelected();
        this.buttonAdd = this.buttonAdd(actionListener);
        this.buttonDelete = this.buttonDelete(actionListener);
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

    private ButtonBound buttonFinalState(ActionListener actionListener) {
        ButtonBound buttonFinalState = new ButtonBound("Final", actionListener, MainActivity.FINAL.toString());
        buttonFinalState.setBorderPainted(false);

        return  buttonFinalState;
    }

    private ButtonBound buttonInitialState(ActionListener actionListener) {
        ButtonBound buttonInitialState = new ButtonBound("Inicial", actionListener, MainActivity.INITIAL.toString());
        buttonInitialState.setBorderPainted(false);

        return  buttonInitialState;
    }

    private JPanel typeState() {
        JPanel typeState = new JPanel(new GridLayout(1,3));
        typeState.setOpaque(false);
        return typeState;
    }

    private JPanel panelTransition() {
        JPanel panelTransition = new JPanel(new GridLayout(1,3));
        panelTransition.setOpaque(false);
        return panelTransition;
    }

    private ComboBoxBound transition() {
        ComboBoxBound transition = new ComboBoxBound();
        return  transition;
    }

    private ComboBoxBound stateEnd() {
        ComboBoxBound stateEnd = new ComboBoxBound();
        return  stateEnd;
    }

    private ComboBoxBound stateStart() {
        ComboBoxBound stateStart = new ComboBoxBound();
        return  stateStart;
    }



    private TextFieldBound fieldAlphabet() {
        TextFieldBound fieldAlphabet = new TextFieldBound("Ingrese un alfabeto");

        return  fieldAlphabet;
    }

    private TextFieldBound fieldState() {
        TextFieldBound fieldState = new TextFieldBound("Ingrese un estado");
        return  fieldState;
    }

    private void dataPanelEndInternalContent () {
        this.actionSelectedInternalContent();
        this.typePanelInternalContent();
        this.add(Constants.insidePanel(this.typeState, 15,20,10,20, "#000000", false));
        this.add(Constants.insidePanel(this.fieldState, 15,20,10,20, "#000000", false));
        this.add(Constants.insidePanel(this.fieldAlphabet, 15,20,10,20, "#000000", false));
        this.panelTransitionInternalContent();
        this.add(Constants.insidePanel(this.panelTransition, 15,20, 10,20, "#000000", false));
        this.add(Constants.insidePanel(this.actionSelected, 15,20,10,20, "#000000", false));
        this.add(Constants.getSpace(0,0,0,0));
    }

    private void actionSelectedInternalContent() {
        this.actionSelected.add(Constants.insidePanel(this.buttonAdd, 0,0,0,10,"#000000", false));
        this.actionSelected.add(Constants.insidePanel(this.buttonDelete, 0,0,0,0,"#000000", false));
    }

    private void typePanelInternalContent() {
        this.typeState.add(Constants.insidePanel(this.buttonInitialState, 0,0,0,10,"#000000", false));
        this.typeState.add(Constants.insidePanel(this.buttonFinalState, 0,0,0,10,"#000000", false));
        this.typeState.add(Constants.getSpace(0,0,0,0));
    }

    private void panelTransitionInternalContent() {
        this.panelTransition.add(Constants.insidePanel(this.stateStart, 0,0, 0,5, "#000000", false));
        this.panelTransition.add(Constants.insidePanel(this.stateEnd, 0,0, 0,5, "#000000", false));
        this.panelTransition.add(Constants.insidePanel(this.transition, 0,0, 0,0, "#000000", false));
    }

    /**
     * String [] element recibe en primer posición el tipo de elemento
     * 1 para estado
     * 2 para alfabeto
     * 3 para transición
     * @return
     */
    public ArrayList<String[]> addElement() {
        ArrayList<String[]> elementsList = new ArrayList<>();
        if (fieldState.getText().length() > 0 && this.initialState == 1 && this.finalState == 0) {
            String[] element = {"1", this.fieldState.getText()};
            elementsList.add(element);
            return elementsList;
        } else if (fieldState.getText().length() > 0 && this.finalState == 1 && this.initialState == 0){
            String[] element = {"1", this.fieldState.getText()};
            elementsList.add(element);
            return elementsList;
        } else if (fieldState.getText().length() > 0 && this.initialState == 1 && this.finalState == 1){
            String[] element = {"1", this.fieldState.getText()};
            elementsList.add(element);
            return elementsList;
        } else if (fieldState.getText().length() > 0 && this.initialState == 0 && this.finalState == 0){
            String[] element = {"1", this.fieldState.getText()};
            elementsList.add(element);
            return elementsList;
        }
        if (fieldAlphabet.getText().length() > 0) {
            String[] element = {"2", this.fieldAlphabet.getText()};
            elementsList.add(element);
            return elementsList;
        }

        return elementsList;
    }

    public void initialState() {
        if (this.initialState == 0){
            this.initialState = 1;
            this.buttonInitialState.setBackground(Color.decode("#ca2b3f"));
        } else {
            this.initialState = 0;
            this.buttonInitialState.setBackground(Color.decode("#444a73"));
        }
    }

    public void finalState() {
        if (this.finalState == 0){
            this.finalState = 1;
            this.buttonFinalState.setBackground(Color.decode("#ca2b3f"));
        } else {
            this.finalState = 0;
            this.buttonFinalState.setBackground(Color.decode("#444a73"));
        }
    }
}
