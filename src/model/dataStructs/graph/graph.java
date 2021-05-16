package model.dataStructs.graph;

import java.util.LinkedList;

public class graph <T,V>{
    private LinkedList<graphNode<T,V>> graph;

    public graph() {
        this.graph = new LinkedList<>();
    }
    public void add (T data){
        this.graph.add(new graphNode<T, V>(data));
    }
    public void addAssociation(T data, T destinationData, V magnitude) throws IndexOutOfBoundsException{
        for (graphNode node: graph) {
            if (node.getData().equals(data) && contains(destinationData)){
                node.addAssociation(destinationData,magnitude);
                break;
            }
        }
    }
    public void removeAssociation(T data, T destinationData, V magnitude) throws IndexOutOfBoundsException{
        for (graphNode node: graph) {
            if (node.getData().equals(data) && contains(destinationData)){
                node.removeAssociation(destinationData,magnitude);
                break;
            }
        }
    }

    public boolean contains (T data){
        boolean contains = false;
        for (graphNode node: graph) {
            if (node.getData().equals(data)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public LinkedList<graphNode<T, V>> getGraph() {
        return graph;
    }
}
