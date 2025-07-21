import java.util.ArrayList;
import java.util.Arrays;

public class Main6 {
//pattern using reccursion
//    ****
//    ***
//    **
//    *
    static void pattern1(int i , int j){
        if(i==0) return;
        if( i > j){
            System.out.print("* ");
            pattern1(i,j+1);
        }else {
            System.out.println();
            pattern1(i-1,0);
        }
    }
//    *
//    * *
//    * * *
//    * * * *
    static void bubbleSortUsingReccursion(int[] arr , int i , int j){
        if(i==0) return;
        if( i > j){
            if(arr[j] > arr[j+1]){
                //swap it
                arr[j] = arr[j] + arr[j+1];
                arr[j+1] =arr[j] - arr[j+1];
                arr[j] = arr[j] - arr[j+1];
            }
            bubbleSortUsingReccursion(arr,i,j+1);
        }else {
            bubbleSortUsingReccursion(arr,i-1,0);
        }
    }

    static void selectionSortUsingReccursion(int[] arr,int i , int j,int max){
        if(i < 0) return;

        if(i >= j){
            if(arr[j] > arr[max]) selectionSortUsingReccursion(arr,i,++j,j);
            else selectionSortUsingReccursion(arr,i,++j,max);
        }else{
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            selectionSortUsingReccursion(arr,--i,0,0);
        }
    }
    static void pattern2(int i , int j){
        if(i==0) return;
        if( i > j){
            pattern2(i,j+1);
            System.out.print("* ");
        }else {
            pattern2(i-1,0);
            System.out.println();
        }
    }
    //permutaion of String using reccursion
    static ArrayList<String> permutation(String s){
      return  permutationHelper(s ,"");
    }
    static ArrayList<String>  permutationHelper(String s , String combi ){
        if(s.isEmpty()){
            ArrayList list = new ArrayList<String>();
            list.add(combi);
            return list;
        }
        char c = s.charAt(0);
        ArrayList ans = new ArrayList<String>();
        for(int i = 0 ; i < combi.length() + 1; i++){
            String first = combi.substring(0,i);
            String second = combi.substring(i);
            ans.addAll(permutationHelper(s.substring(1),first+c+second));
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {3,1,1,2,5,4,3,2,1};
        selectionSortUsingReccursion(arr,arr.length - 1 ,0,0);
        System.out.println(Arrays.toString(arr));


    }
}
