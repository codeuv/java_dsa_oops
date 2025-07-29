import java.util.ArrayList;
import java.util.Arrays;

public class Main7_1 {
    static String removeLetter(String s , char ch){
        StringBuilder ans = new StringBuilder();
        return removeLetterHelper(s,ch,ans).toString();
    }
    private static StringBuilder removeLetterHelper(String s, char ch,StringBuilder ans) {
        if(s.length() == 0) return ans;
        if(s.charAt(0) == ch) return removeLetterHelper(s.substring(1),ch,ans);
        else return removeLetterHelper(s.substring(1),ch, ans.append(s.charAt(0)));
    }

    static void printSubstrings(String s){
        printSubstringsHelper(s,"");
    }
    private static void printSubstringsHelper(String s, String up) {
        if(s.isEmpty()){
            System.out.println(up);
            return;
        }
        printSubstringsHelper(s.substring(1),up+s.charAt(0));
        printSubstringsHelper(s.substring(1),up);

    }
    static ArrayList substringsIterative(String s){
        ArrayList list = new ArrayList<>();
        list.add("");
        for(int i = 0 ; i < s.length() ;i++){
            ArrayList temp = new ArrayList<>();
            for(int j = 0 ; j < list.size();j++){
                temp.add((String) list.get(j)+ s.charAt(i));
            }
            list.addAll(temp);

        }

        return list;
    }


     static ArrayList allSubString(String s, String up ) {
        if(s.isEmpty()){
            ArrayList l = new ArrayList<>();
            l.add(up);
            return l;

        }
        ArrayList left =  allSubString(s.substring(1),up+s.charAt(0));
        ArrayList right = allSubString(s.substring(1),up);

        left.addAll(right);
        return left;


    }



    static boolean isSubsequence(String word , String subsequence){
        return true;
    }
    public static void main(String[] args) {
        printSubstrings("ABCD");
    }
}
