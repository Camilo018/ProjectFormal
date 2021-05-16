package model.entities;

public class State {

    private  String value;
    private boolean finalState;
    private boolean initalState;

    public State(String value, boolean finalState, boolean initalState) {
        this.value = value;
        this.finalState = finalState;
        this.initalState = initalState;
    }

    public State() {
    }

    public String getValue() {
        return value;
    }

    public boolean isFinalState() {
        return finalState;
    }

    public void setFinalState(boolean finalState) {
        this.finalState = finalState;
    }

    public boolean isInitialState() {
        return initalState;
    }

    public void setInitialState(boolean initalState) {
        this.initalState = initalState;
    }
}
