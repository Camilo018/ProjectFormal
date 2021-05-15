package controller;


import model.DataManager;
import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {

    private MainView mainView;
    private DataManager dataManager;

    public MainController() {
        this.mainControllerInstances();
    }

    private void mainControllerInstances() {
        this.dataManager = new DataManager();
        this.mainView = new MainView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
