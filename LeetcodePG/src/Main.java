import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return letterCombinations(digits,"",result,phone);

    }

    public static List<String> letterCombinations(String digits,String combi,List<String> result,String[] phone){
            if(digits.length() == 0 ){
                result.add(combi);
            }else{
                int firstNo = Character.getNumericValue(digits.charAt(0));
                String keypad = phone[firstNo];
                for(int i = 0 ; i < keypad.length() ; i++){
                    letterCombinations(digits.substring(1),combi + keypad.charAt(i),result,phone);
                }
            }
            return result;
    }

//    public static List<List<Integer>> sumOfDice(int sum){
//        int[] dice = {1,2,3,4,5,6};
//        List<List<Integer>> result =  new ArrayList<>();
//        return sumOfDiceHelper(new ArrayList<Integer>(), sum ,result ,dice);
//    }
//    static List<List<Integer>> sumOfDiceHelper(List<Integer> possible, int sum, List<List<Integer>>  result, int[] dice){
//        if( sum == 0 ){
//            result.add(possible);
//        }
//        if(sum < 0){
//            return result;
//        }
//
//        for(int i = 0 ; i < dice.length ;i++){
//            possible.add(dice[i]);
//            sumOfDiceHelper(possible , sum - dice[i] , result , dice);
//        }
//        return result;
//    }

    public static List<List<Integer>> sumOfDice(int sum){
        int[] dice = {2,3,6,7};
        return sumOfDiceHelper(new ArrayList<Integer>(), sum ,dice);
    }

    private static List<List<Integer>> sumOfDiceHelper(List<Integer> posible, int sum, int[] dice) {
        List<List<Integer>> result =  new ArrayList<>();
        if(sum < 0) return result;
        if(sum==0){
            result.add(posible);
            return result;
        }

        for(int i = 0 ; i < dice.length ; i++){
            List<Integer> temp = new ArrayList<>(posible);
            temp.add(dice[i]);
            result.addAll(sumOfDiceHelper(temp,sum - dice[i],dice));
        }

        return result;

    }


    static List<String> sumofdice(int n){
        int[] d = {1,2,3,4,5,6,7};
        return sumofdice("", n,d);
    }
    static List<String> sumofdice(String ans , int n , int[] d){
        List<String> local = new ArrayList<>();
        if(n < 0) return local;
        if(n==0) {
            List<String> s = new ArrayList<>();
            s.add(ans);
            return s;
        }

        for(int i = 0 ; i < d.length;i++ ){
            local.addAll(sumofdice(ans+d[i] , n - d[i] ,d));
        }
        return local;
    }
    public static void main(String[] args) {

        System.out.println(sumOfDice(7));




    }
}