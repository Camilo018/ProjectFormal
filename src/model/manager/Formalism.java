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
    public State getInitialState(){
        State initialState = null;
        for (State state:states) {
            if (state.isInitialState()){
                initialState = state;
                break;
            }
        }
        return initialState;
    }
    public ArrayList<State> getFinalStates(){
        ArrayList<State> finalStates = new ArrayList<>();
        for (State state:states) {
            if (state.isFinalState()){
                finalStates.add(state);
            }
        }
        return finalStates;
    }
    public boolean haveFinalStates(){
        boolean haveFinal = false;
        for (State state:states) {
            if (state.isFinalState()){
                haveFinal=true;
                break;
            }
        }
        return haveFinal;
    }

    public void addTransition(String initial, String symbol, String result) {
        State initialAux = null;
        State resultAux = null;
        if (existState(initial) && existState(result) && verifyTransition(initial, symbol, result)){
            for (State state : this.states) {
                if (state.getValue().equals(initial)){
                    initialAux = state.getStateByValue(initial);
                }
                if (state.getValue().equals(result)){
                    resultAux = state.getStateByValue(result);
                }
            }
            transitions.add(new Transition(initialAux,symbol,resultAux));
        }

    }
    private boolean verifyTransition(String initial, String symbol, String result){
        boolean transitionVerifier = false;
        for (Transition inListTransition:this.transitions) {
                if (inListTransition.getInitial().getValue().equals(initial) &&
                        inListTransition.getSymbol().equals(symbol) &&
                        inListTransition.getResult().getValue().equals(result)) {
                    transitionVerifier = true;

                    break;
                }
            }
        System.out.println(transitionVerifier);
        return transitionVerifier;
    }
    private boolean existState(String state){
        boolean exist = false;
        for (State inListState : this.states) {
            if (inListState.getValue().equals(state)){
                exist = true;
                break;
            }
        }
        return exist;
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

    public ArrayList<Transition> getTransitionBySymbol(String simbol, State state) {
        ArrayList<Transition> result = new ArrayList<>();
        for (Transition transition : transitions) {
            if (transition.getInitial() == state && transition.getSymbol().equals(simbol))
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
