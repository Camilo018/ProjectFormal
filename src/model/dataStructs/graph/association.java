package model.dataStructs.graph;

public class association <T,V>{
    private T destinationData;
    private V magnitude;

    public association(T destinationData, V magnitude) {
        this.destinationData = destinationData;
        this.magnitude = magnitude;
    }

    public T getDestinationData() {
        return destinationData;
    }

    public V getMagnitude() {
        return magnitude;
    }
}
