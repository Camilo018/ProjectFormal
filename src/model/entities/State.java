package model.entities;

public class State {

    private  String value;
    private boolean finalState;
    private boolean initialState;

    public State(String value, boolean finalState, boolean initialState) {
        this.value = value;
        this.finalState = finalState;
        this.initialState = initialState;
    }

    public State() {
    }

    public String getValue() {
        return value;
    }

    public State getStateByValue(String value){
        State state= null;
        if (this.value.equals(value)){
            state = this;
        }
        return state;
    }

    public boolean isFinalState() {
        return finalState;
    }

    public void setFinalState(boolean finalState) {
        this.finalState = finalState;
    }

    public boolean isInitialState() {
        return initialState;
    }

    public void setInitialState(boolean initalState) {
        this.initialState = initalState;
    }
}
