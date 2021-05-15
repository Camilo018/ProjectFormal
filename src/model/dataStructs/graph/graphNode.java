package model.dataStructs.graph;

import model.dataStructs.list.SimpleList;

public class graphNode<T> {
    public T data;
    public SimpleList<T> associations;

    public graphNode(T data) {
        this.data = data;
        this.associations = new SimpleList<>();
    }

    public void addAssociation (T association){
        this.associations.add(association);
    }

    public T getData() {
        return data;
    }

    public SimpleList<T> getAssociations() {
        return associations;
    }
}
