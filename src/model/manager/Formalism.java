package model.manager;

import model.entities.Status;
import model.entities.StatusType;
import model.entities.Transition;

import java.util.ArrayList;

public class Formalism {

    private ArrayList<Status> statuses;
    private ArrayList <String>  symbols;
    private ArrayList<Transition> transitions;

    public Formalism() {
        statuses = new ArrayList<>();
        symbols = new ArrayList<>();
        transitions = new ArrayList<>();
    }
    public Status getInitialStatus(){
        Status initialStatus = new Status();
        for (Status status:statuses) {
            if (status.getStatusType()== StatusType.INITIAL){
                initialStatus = status;
                break;
            }
        }
        return initialStatus;
    }
    public ArrayList<Status> getFinalStatus(){
        ArrayList<Status> finalStatuses = new ArrayList<>();
        for (Status status:statuses) {
            if (status.getStatusType()== StatusType.INITIAL){
                finalStatuses.add(status);
            }
        }
        return finalStatuses;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    public ArrayList<String> getSymbols() {
        return symbols;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }
}
