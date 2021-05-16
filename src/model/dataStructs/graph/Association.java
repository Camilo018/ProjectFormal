package model.dataStructs.graph;

public class Association<T,V>{
    private T destinationData;
    private V magnitude;

    public Association(T destinationData, V magnitude) {
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
