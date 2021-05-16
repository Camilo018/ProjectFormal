package model.dataStructs.graph;

import java.util.LinkedList;

public class Graph<T,V>{
    private LinkedList<GraphNode<T,V>> graph;

    public Graph() {
        this.graph = new LinkedList<>();
    }
    public void add (T data){
        this.graph.add(new GraphNode<T, V>(data));
    }
    public void addAssociation(T data, T destinationData, V magnitude) throws IndexOutOfBoundsException{
        for (GraphNode node: graph) {
            if (node.getData().equals(data) && contains(destinationData)){
                node.addAssociation(destinationData,magnitude);
                break;
            }
        }
    }
    public void removeAssociation(T data, T destinationData, V magnitude) throws IndexOutOfBoundsException{
        for (GraphNode node: graph) {
            if (node.getData().equals(data) && contains(destinationData)){
                node.removeAssociation(destinationData,magnitude);
                break;
            }
        }
    }
    public void removeNode(T data) {
        int i = 0;
        for (GraphNode node: this.graph) {
            node.removeAssociation(data);
            if (node.getData().equals(data)){
                i = this.graph.indexOf(node);
            }
        }
        this.graph.remove(i);
    }

    public boolean contains (T data){
        boolean contains = false;
        for (GraphNode node: graph) {
            if (node.getData().equals(data)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public LinkedList<GraphNode<T, V>> getGraph() {
        return graph;
    }
}
