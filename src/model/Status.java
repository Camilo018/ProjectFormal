package model;

public class Status {

    private  String value;
    private  StatusType statusType;

    public Status(String value, StatusType statusType) {
        this.value = value;
        this.statusType = statusType;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public String getValue() {
        return value;
    }
}
