package model.manager;


import model.dataStructs.graph.Graph;
import model.entities.State;
import model.entities.Transition;

import java.util.LinkedList;

public class Automaton {

    private Formalism formalism;
    private Graph<State, String> automatonGraph;

    public Automaton() {
        this.formalism = new Formalism();
        addStates();
        addTransitions();
    }

    public void addState (State state) {
        automatonGraph.add(state);
    }

    public void addTransitions (State originState, String symbol, State destinationState) throws IndexOutOfBoundsException{
        automatonGraph.addAssociation(originState, destinationState, symbol);
    }

    public void removeState (State state) throws IndexOutOfBoundsException{
        automatonGraph.removeNode(state);
    }

    public void removeTransition(State originState, String symbol, State destinationState) throws  IndexOutOfBoundsException{
        automatonGraph.removeAssociation(originState, destinationState,symbol);
    }
    private void addStates (){
        this.automatonGraph = new Graph<>();
        for (State state :formalism.getStates()) {
            this.automatonGraph.add(state);
        }
    }
    private void addTransitions () throws IndexOutOfBoundsException{
        for (Transition transition:formalism.getTransitions()) {
            automatonGraph.removeAssociation(transition.getInitial(),transition.getResult(),transition.getSymbol());
        }
    }
    public boolean checkWord (LinkedList <String> word){
        return true;
    }
}
