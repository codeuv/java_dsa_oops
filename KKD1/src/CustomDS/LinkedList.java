package CustomDS;

public class LinkedList<T>{
   LinkedListNode<T> head;
   private int size;
    public void add(T data){
        LinkedListNode node = new LinkedListNode<>(data);
        this.add(node);

    }
    public void add(LinkedListNode<T> node){
        if(head == null){
            head = node;
        }else{
            LinkedListNode<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }

        size++;
    }
    public T remove(){
        T data;
        if(head == null){
            return null;
        }

        if(head.next == null){
            this.head = null;
            --size;
            return null;
        }

        LinkedListNode<T> temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        data = (T) temp.next.data;
        temp.next = null;
        --size;
        return data;
    }
    public void print(){
        LinkedListNode<T> temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int size(){
        return size;
    }
    public LinkedListNode get(int i ){
        if(i < 0 || i >= size){
            System.out.println(" OUT OF BOUNDS");
            return null;
        }
        LinkedListNode temp = head;

        int start = 0 ;

        while(start != i){
            temp = temp.next;
            start++;
        }
        return temp;
    }
    public void insert(T data , int position){
        LinkedListNode node = new LinkedListNode<>(data);
        this.insert(node,position);

    }
    public void addFirst(T data){
        LinkedListNode node = new LinkedListNode<>(data);
        this.addFirst(node);
    }
    public void addFirst(LinkedListNode node){
        node.next = head;
        head = node;
        size++;
    }
    public void insert(LinkedListNode node,int position){
        if(position < 0 || position >= size) {
            System.out.println("CANNOT INSERT OUT OF BOUNDS");
            return;
        }

        if(position == 0) {
            addFirst(node);
            return;
        }

        LinkedListNode temp = get(position - 1);
        LinkedListNode copyOfNext = temp.next;

        temp.next = node;
        node.next = copyOfNext;
        size++;

    }

}