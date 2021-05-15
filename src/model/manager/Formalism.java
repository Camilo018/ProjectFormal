package model.manager;

import model.entities.Status;
import model.entities.Transition;

import java.util.ArrayList;

public class Formalism {

    private ArrayList<Status> statuses;
    private ArrayList <String>  symbols;
    private ArrayList<Transition> transitions;

    public Formalism() {
        statuses = new ArrayList<>();
        symbols = new ArrayList<>();
        transitions = new ArrayList<>();
    }




}
