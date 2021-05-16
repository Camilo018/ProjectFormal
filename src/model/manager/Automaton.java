package model.manager;


import model.dataStructs.graph.Graph;
import model.entities.State;
import model.entities.Transition;

import java.util.LinkedList;

public class Automaton {

    private Formalism formalism;
    private Graph<State, String> automatonGraph;

    public Automaton(Formalism formalism) {
        this.formalism = formalism;
        addStates();
        addTransitions();
    }

    public void addState (State state) {
        automatonGraph.add(state);
    }

    public void addTransition (State originState, String symbol, State destinationState) throws IndexOutOfBoundsException{
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
        for (State state :this.formalism.getStates()) {
            this.automatonGraph.add(state);
        }
    }
    private void addTransitions () throws IndexOutOfBoundsException{
        for (Transition transition:formalism.getTransitions()) {
            automatonGraph.addAssociation(transition.getInitial(),transition.getResult(),transition.getSymbol());
        }
    }

    public Graph<State, String> getAutomatonGraph() {
        return automatonGraph;
    }

    public Formalism getFormalism() {
        return formalism;
    }

    public boolean checkWord (LinkedList <String> word){
        return true;
    }
}
