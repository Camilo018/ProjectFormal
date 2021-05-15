package model.entities;

import model.entities.Status;

public class Transition {

    private Status initial;
    private  String symbol;
    private Status result;

    public Transition(Status initial, String symbol, Status result) {
        this.initial = initial;
        this.symbol = symbol;
        this.result = result;
    }

    public Status getInitial() {
        return initial;
    }

    public Status getResult() {
        return result;
    }

    public String getSimbol() {
        return symbol;
    }
}
