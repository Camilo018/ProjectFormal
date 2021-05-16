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

    }
}
