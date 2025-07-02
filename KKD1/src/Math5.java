//reccursion

import java.util.ArrayList;

public class Math5 {
    static void printnto1(int n ){
        if(n == 0 ) return;
        System.out.println(n);
        printnto1(n-1);

    }
    static void print1ton(int n ){
        if(n == 0 ) return;
        print1ton(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if(n <= 1)return 1;
        return n * factorial(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0) return 0;
        else return n % 10 + sumOfDigits(n / 10);
    }
    static int reverseNumber(int n ){

        int noOfdigits = (int)Math.log10(n) + 1;
        return reverseNumberHelper(n,noOfdigits);
    }
    static int reverseNumberHelper(int n , int noOfdigits){
        if(n==0) return 0;
       return (int) ((n % 10)*Math.pow(10,noOfdigits - 1)) + reverseNumberHelper(n/10,noOfdigits -1 );
    }
    //arrays
    static boolean isSorted(int[] arr,int start ,int end){
        if(start == end) return true;
        if(arr[start] < arr[start+1]) return isSorted(arr,start+1,end);
        else return false;
    }
    static int linearSearch(int[] arr,int target,int start ,int end){
        if(start <= end){
            if(arr[start] == target) return start;
            else return linearSearch(arr,target,start+1,end);
        }
        return -1;
    }
    static ArrayList<Integer> linearSearchAll(int[] arr, int target){
        ArrayList<Integer> result = new ArrayList<>();
        return linearSearchAllHelper(arr,target,0,result);
    }
    private static ArrayList<Integer> linearSearchAllHelper(int[] arr, int target,int i, ArrayList<Integer> result) {
        if( i == arr.length) return result;
        if(arr[i] == target) result.add(i);

        return linearSearchAllHelper(arr,target,i+1,result);
    }
    static int binarySearch(int[] arr ,int target,int start ,int end){
        if(start > end) return -1 ;
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binarySearch(arr,target,start,mid-1);
        else return binarySearch(arr,target,mid+1,end);
    }
    //patterns
            /*
    * * * *
    * * *
    * *
    *
            */
    static void pattern1(int row , int col){
        if(row > 0 ){
            System.out.print("* ");
            pattern1(row - 1,col);
        }if(col > 4){
            pattern1(row - 1,col);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,6,12,12,20};
        System.out.println(binarySearch(arr,270,0, arr.length -1)  );

    }
}
