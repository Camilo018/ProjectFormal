package model.manager;


import model.dataStructs.graph.Graph;
import model.entities.Status;

public class Automaton {

    private Formalism formalism;
    private Graph<Status, String> automatonGraph;

    public Automaton() {
        this.formalism = new Formalism();
    }

    public void addState (Status status) {
        automatonGraph.add(status);
    }

    public void addTransitions (Status originStatus, String symbol,Status destinationStatus) throws IndexOutOfBoundsException{
        automatonGraph.addAssociation(originStatus, destinationStatus, symbol);
    }

}
