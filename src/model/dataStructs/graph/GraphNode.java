package model.dataStructs.graph;


import java.util.LinkedList;

public class GraphNode<T, V> {
    private T data;
    private LinkedList<Association<T,V>> associations;

    public GraphNode(T data) {
        this.data = data;
        this.associations = new LinkedList<>();
    }

    public void addAssociation (T destinationData, V magnitude) throws IndexOutOfBoundsException{
        this.associations.add(new Association(destinationData, magnitude));
    }

    public void removeAssociation (T destinationData, V magnitude) throws IndexOutOfBoundsException{
        if (contains(destinationData , magnitude)){
            for (Association association : associations) {
                if (association.getDestinationData().equals(destinationData) && association.getMagnitude().equals(magnitude)){
                    associations.remove(association);
                    break;
                }
            }
        }
    }

    public void removeAssociation (T destinationData) throws IndexOutOfBoundsException{
        if (contains(destinationData)){
            for (Association association : associations) {
                if (association.getDestinationData().equals(destinationData)){
                    associations.remove(association);
                    break;
                }
            }
        }
    }

    public boolean contains(T destinationData, V magnitude){
        boolean contains = false;
        for (Association association: associations) {
            if (association.getDestinationData().equals(destinationData) && association.getMagnitude().equals(magnitude)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public boolean contains(T destinationData){
        boolean contains = false;
        for (Association association: associations) {
            if (association.getDestinationData().equals(destinationData)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public T getData() {
        return data;
    }

    public LinkedList<Association<T,V>> getAssociations() {
        return associations;
    }
}
