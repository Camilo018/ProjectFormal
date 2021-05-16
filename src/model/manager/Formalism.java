package model.manager;

import model.entities.State;
import model.entities.Transition;

import java.util.ArrayList;

public class Formalism {

    private ArrayList<State> states;
    private ArrayList <String>  symbols;
    private ArrayList<Transition> transitions;

    public Formalism() {
        states = new ArrayList<>();
        symbols = new ArrayList<>();
        transitions = new ArrayList<>();
    }
    public State getInitialState(){
        State initialState = new State();
        for (State state : states) {
            if (state.isInitialState()){
                initialState = state;
                break;
            }
        }
        return initialState;
    }
    public ArrayList<State> getFinalState(){
        ArrayList<State> finalStates = new ArrayList<>();
        for (State state : states) {
            if (state.isFinalState()){
                finalStates.add(state);
            }
        }
        return finalStates;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public ArrayList<String> getSymbols() {
        return symbols;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }
}
