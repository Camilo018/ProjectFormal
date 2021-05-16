package controller;


import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {

    private MainView mainView;

    public MainController() {
        this.mainControllerInstances();
    }

    private void mainControllerInstances() {
        this.mainView = new MainView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (MainActivity.valueOf(e.getActionCommand())) {
            case VALIDATE_WORD:
                this.validateWord();
                break;
            case ADD_STATE:
                this.addState();
                break;
            case ADD_ALPHABET:
                this.addAlphabet();
                break;
            case DELETE_STATE:
                this.deleteState();
                break;
            case ADD_TRANSITION:
                this.addTranstion();
                break;
            case DELETE_ALPHABET:
                this.deleteAlphabet();
                break;
            case DELETE_TRANSITION:
                this.deleteTransition();
                break;

            case DELETE:
                break;
            case ADD:
                break;
                
        }
    }

    private void deleteTransition() {
    }

    private void deleteAlphabet() {
        
    }

    private void addTranstion() {
        
    }

    private void deleteState() {
        
    }

    private void addAlphabet() {
        
    }

    private void addState() {
        
    }

    private void validateWord() {
        
    }
}
