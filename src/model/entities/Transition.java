package model.entities;

public class Transition {

    private State initial;
    private  String symbol;
    private State result;

    public Transition(State initial, String symbol, State result) {
        this.initial = initial;
        this.symbol = symbol;
        this.result = result;
    }

    public State getInitial() {
        return initial;
    }

    public State getResult() {
        return result;
    }

    public String getSymbol() {
        return symbol;
    }
}
