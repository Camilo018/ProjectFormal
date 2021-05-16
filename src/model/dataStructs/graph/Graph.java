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
    private void add (GraphNode<T, V> node){
        this.graph.add(node);
    }
    public void removeAssociation(T data, T destinationData, V magnitude) throws IndexOutOfBoundsException{
        for (GraphNode node: graph) {
            if (node.getData().equals(data) && contains(destinationData)){
                node.removeAssociation(destinationData,magnitude);
                break;
            }
        }
    }
    public Graph <T, V> getAdjacentByMagnitude(T data,V magnitude){
        LinkedList<GraphNode<T,V>> aux = this.graph;
        Graph <T, V> subGraph = new Graph<>();
        int i = getIndex(aux, data);
        LinkedList<Association<T,V>> associationsAux = aux.get(i).getAssociations();
        for (Association association: associationsAux) {
            if (association.getMagnitude().equals(magnitude)){
                System.out.println(i);
                subGraph.add(aux.get(i));
            }
        }
        return subGraph;
    }

    private int getIndex( LinkedList<GraphNode<T,V>> aux, T data) {
        int i = 0;
        for (GraphNode node: aux) {
            if (node.getData().equals(data)){
                i = aux.indexOf(node);
                break;
            }
        }
        return i;
    }

    public void removeNode(T data) throws IndexOutOfBoundsException {
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
