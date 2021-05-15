package model.dataStructs.graph;


import java.util.LinkedList;

public class graph <T>{
    private LinkedList<graphNode> graph;

    public graph() {
        this.graph = new LinkedList<>();
    }

    public void addNode(T data){
        this.graph.add(new graphNode(data));
    }

    public void addAssociationToNode(T data ,T dataToAssociate){
        graphNode aux = this.graph.get(this.graph.indexOf(data));
        aux.addAssociation(dataToAssociate);
        this.graph.set(this.graph.indexOf(data),aux);
    }
    public void removeAssociationToNode(T data ,T associationToRemove){
        graphNode aux = this.graph.get(this.graph.indexOf(data));
        aux.removeAssociation(associationToRemove);
        this.graph.set(this.graph.indexOf(data),aux);
    }

    public void removeNode(T data){
        this.graph.remove(this.graph.indexOf(data));
    }
    public LinkedList<T> getAssociations (T data){
        LinkedList<T> associations = this.graph.get(this.graph.indexOf(data)).getAssociations();
        return associations;
    }
    public boolean contains (T data){
        return this.graph.contains(data);
    }
}
