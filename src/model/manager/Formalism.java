package model.manager;


import model.entities.State;
import model.entities.Transition;

import java.util.ArrayList;

public class Formalism {


    private ArrayList<String> symbols;
    private ArrayList<Transition> transitions;
    private ArrayList<State> states;


    public Formalism() {
        symbols = new ArrayList<>();
        transitions = new ArrayList<>();
        states = new ArrayList<>();
    }

    public boolean addState(State state) {
        if (haveInitial() && state.isInitialState()) {
            return false;
        } else if (alreadyExistState(state.getValue())) {
            return false;
        } else {
            states.add(state);
            return true;
        }
    }

    public void addTransition(Transition transition) {
        transitions.add(transition);
    }

    public boolean haveInitial() {
        for (State state : states) {
            if (state.isInitialState())
                return true;
        }
        return false;
    }

    public boolean alreadyExistState(String value) {
        for (State state : states) {
            if (state.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public boolean addSymbol(String symbol) {
        if (symbols.contains(symbol)) {
            return false;
        } else {
            symbols.add(symbol);
            return true;
        }
    }


    public void validateWord(String word) {

    }

    public ArrayList<Transition> getTransitionBySimbol(String simbol, State state) {
        ArrayList<Transition> result = new ArrayList<>();
        for (Transition transition : transitions) {
            if (transition.getInitial() == state && transition.getSimbol().equals(simbol))
                result.add(transition);
        }
        return result;
    }

    public ArrayList<String> getSymbols() {
        return symbols;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public ArrayList<State> getStates() {
        return states;
    }
}
