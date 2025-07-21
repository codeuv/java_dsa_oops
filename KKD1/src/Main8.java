import CustomDS.LinkedList;

public class Main8 {



    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.addFirst(999);
        list.print();
        list.insert(100,0);
        list.print();
        System.out.println(list.size());





    }
}




