package model.dataStructs.list;

public class SimpleList <T>{
    private Node<T> head;

    public SimpleList() {
        this.head = null;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
    public void add (T data){
        if (this.head == null) {
            head = new Node(data);
        } else {
            Node aux = head;
            while (aux.getNext() !=null){
                aux = aux.getNext();
            }
            aux.setNext(new Node(data));
        }
    }
    public void delete (T data){
        if (head != null){
            Node aux = head;
            Node last = null;
            while (aux !=null && data != aux.getData()){
                last = aux;
                aux = aux.getNext();
            }
            if (data == aux.getData()){
                if (aux == head){
                    head = aux.getNext();
                } else{
                    last.setNext(aux.getNext());
                }
            }
        }
    }
}
