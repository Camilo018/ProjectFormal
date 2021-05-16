package model.dataStructs.graph;


import java.util.LinkedList;

public class graphNode<T, V> {
    public T data;
    public LinkedList<association<T,V>> associations;

    public graphNode(T data) {
        this.data = data;
        this.associations = new LinkedList<>();
    }

    public void addAssociation (T destinationData, V magnitude) throws IndexOutOfBoundsException{
        this.associations.add(new association(destinationData, magnitude));
    }

    public void removeAssociation (T destinationData, V magnitude) throws IndexOutOfBoundsException{
        if (contains(destinationData , magnitude)){
            for (association association : associations) {
                if (association.getDestinationData().equals(destinationData) && association.getMagnitude().equals(magnitude)){
                    associations.remove(association);
                    break;
                }
            }
        }
    }
    public boolean contains(T destinationData, V magnitude){
        boolean contains = false;
        for (association association: associations) {
            if (association.getDestinationData().equals(destinationData) && association.getMagnitude().equals(magnitude)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public T getData() {
        return data;
    }

    public LinkedList<association<T,V>> getAssociations() {
        return associations;
    }
}
