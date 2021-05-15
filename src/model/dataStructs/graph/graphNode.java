package model.dataStructs.graph;


import java.util.LinkedList;

public class graphNode<T> {
    public T data;
    public LinkedList<T> associations;

    public graphNode(T data) {
        this.data = data;
        this.associations = new LinkedList<>();
    }

    public void addAssociation (T association){
        this.associations.add(association);
    }

    public void removeAssociation (T association){
        this.associations.remove(association);
    }

    public T getData() {
        return data;
    }

    public LinkedList<T> getAssociations() {
        return associations;
    }
}
