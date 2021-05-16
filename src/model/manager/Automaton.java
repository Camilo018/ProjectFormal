package model.manager;


import model.dataStructs.graph.graph;
import model.entities.Status;

public class Automaton {

    private Formalism formalism;
    private graph<Status, String> automatonGraph;

    public Automaton() {
        this.formalism = new Formalism();
    }

}
