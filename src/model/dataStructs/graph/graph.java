package model.dataStructs.graph;


import java.util.LinkedList;

public class graph <T>{
    LinkedList<graphNode> graph;

    public graph() {
        this.graph = new LinkedList<>();
    }
    public void addNode(T data){
        graph.add(new graphNode(data));
    }
    public void addAssosiationToNode(T data ,T dataToAssociate){
    }
}
