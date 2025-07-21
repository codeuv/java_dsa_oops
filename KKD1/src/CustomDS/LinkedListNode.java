package CustomDS;

public class LinkedListNode<T>{
    public T data;
    LinkedListNode next;
    LinkedListNode(){

    }
    LinkedListNode(T data){
        this.data = data;
    }

    public LinkedListNode(T data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }




}