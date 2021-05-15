package model;

public class Transition {

    private String status;
    private String symbol;
    private String result;

    public Transition(String status, String symbol, String result) {
        this.status = status;
        this.symbol = symbol;
        this.result = result;
    }

    public String getResulting() {
        return result;
    }

    public String getStatus() {
        return status;
    }

    public String getSymbol() {
        return symbol;
    }


}
