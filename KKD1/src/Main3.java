//string n stringBuilder

import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {

        String a = "Yuvaraj raj";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.concat(" XX"));
        System.out.println(a.equals("Yuvaraj"));
        System.out.println(a.repeat(3));
        System.out.println(a.replace('a','e'));
        System.out.println(a.replace("raj","XXX"));
        System.out.println(a.contentEquals("Yuvaraj "));
        System.out.println(a.substring(1));
        System.out.println(a.subSequence(1,6));

    }
}
