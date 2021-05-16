package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class DataPanelEnd extends JPanel {

    private TextFieldBound fieldState;
    private TextFieldBound fieldAlphabet;
    private ButtonBound buttonInitialState;
    private ButtonBound buttonFinalState;
    private ButtonBound buttonBoundValidate;
    private ComboBoxBound stateStart;
    private ComboBoxBound stateEnd;
    private ComboBoxBound transition;
    private JPanel panelTransition;
    private JPanel typeState;

    public DataPanelEnd() {
        this.dataPanelEndFeatures();
        this.dataPanelEndInstances();
        this.dataPanelEndInternalContent();
    }

    private void dataPanelEndFeatures () {
        this.setLayout(new GridLayout(6,1 ));
        this.setOpaque(false);
    }

    private void dataPanelEndInstances () {
        this.typeState = this.typeState();
        this.buttonInitialState = this.buttonInitialState();
        this.buttonFinalState = this.buttonFinalState();
        this.fieldState = this.fieldState();
        this.fieldAlphabet = this.fieldAlphabet();
        this.buttonBoundValidate = this.buttonBoundValidate();
        this.panelTransition = this.panelTransition();
        this.stateStart = this.stateStart();
        this.stateEnd = this.stateEnd();
        this.transition = this.transition();
    }

    private ButtonBound buttonFinalState() {
        ButtonBound buttonFinalState = new ButtonBound("Final");
        return  buttonFinalState;
    }

    private ButtonBound buttonInitialState() {
        ButtonBound buttonInitialState = new ButtonBound("Inicial");
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

    private ButtonBound buttonBoundValidate() {
        ButtonBound buttonBound = new ButtonBound("Validar palabra");
        return  buttonBound;
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
        this.typePanelInternalContent();
        this.add(Constants.insidePanel(this.typeState, 15,20,10,20, "#000000", false));
        this.add(Constants.insidePanel(this.fieldState, 15,20,10,20, "#000000", false));
        this.add(Constants.insidePanel(this.fieldAlphabet, 15,20,10,20, "#000000", false));
        this.panelTransitionInternalContent();
        this.add(Constants.insidePanel(this.panelTransition, 15,20, 10,20, "#000000", false));
        this.add(Constants.insidePanel(this.buttonBoundValidate, 15,80,10,80, "#000000", false));
        this.add(Constants.getSpace(0,0,0,0));
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

}
