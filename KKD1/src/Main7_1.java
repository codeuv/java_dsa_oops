import java.util.ArrayList;
import java.util.Arrays;

public class Main7_1 {
    static String removeLetter(String s , char ch){
        StringBuilder ans = new StringBuilder();
        return removeLetterHelper(s,ch,ans).toString();
    }
    static void printSubstrings(String s){

        printSubstringsHelper(s,"");
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
    private static void printSubstringsHelper(String s, String up) {
            if(s.isEmpty()){
                System.out.println(up);
                return;
            }
            printSubstringsHelper(s.substring(1),up+s.charAt(0));
            printSubstringsHelper(s.substring(1),up);

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

    private static StringBuilder removeLetterHelper(String s, char ch,StringBuilder ans) {
        if(s.length() == 0) return ans;
        if(s.charAt(0) == ch) return removeLetterHelper(s.substring(1),ch,ans);
        else return removeLetterHelper(s.substring(1),ch, ans.append(s.charAt(0)));
    }

    static boolean isSubsequence(String word , String subsequence){
        return true;
    }
    public static void main(String[] args) {
        String[] arr = (String[]) substringsIterative("ABCD").toArray(new String[0]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
