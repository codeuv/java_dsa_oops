//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> s = new CustomStack<>(5);
        System.out.println(s.peek());
        s.push(1);
        s.push(7);
        s.push(8);
        s.push(12);
        s.push(123);
        s.push(124);

        s.display();

        System.out.println(s.pop());
        s.display();

        System.out.println(s.pop());
        s.display();

        System.out.println(s.pop());
        s.display();

        System.out.println(s.pop());
        s.display();

        System.out.println(s.pop());
        s.display();

        System.out.println(s.pop());
        s.display();

    }
}