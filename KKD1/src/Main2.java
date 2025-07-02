import java.util.ArrayList;
import java.util.Arrays;



//important Sorting algos

public class Main2 {
    static void bubbleSort(int[] nums ){
        boolean isSorted ;
        for(int i = 0 ; i < nums.length - 1; i++){
            isSorted = true;
            for(int j = 0 ; j < nums.length - i-1 ; j++){
                if(nums[j] > nums[j+1] ){
                    isSorted = false;
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(isSorted){
                return;
            }
        }
    }
    static void selectionSort(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ;i++){
            int minIndex = i+1;
            for(int j = i+1 ; j < nums.length;j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            int temp = nums[minIndex];
            nums[minIndex]= nums[i];
            nums[i] = temp;
        }
    }
    static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int elem = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > elem) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = elem;
        }
    }
    static void cyclicSort(int[] nums){
        int i = 0 ;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }
    static void swapArray(int[] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
    static void cyclicSort1(int[] nums){
        int i = 0 ;

        while(i < nums.length){
            if(nums[i] != i + 1) swapArray(nums,nums[i] - 1, i);
            else i++;
        }

    }
    static int missingNumber (int[] nums){
        int i = 0;
        while(i< nums.length){
            if(nums[i] == nums.length || nums[i] == i) i++;
            else swapArray(nums,nums[i],i);
        }

        for(int j = 0 ; j < nums.length ;j++){
            if(nums[j] != j){
                return j;
            }
        }

        return nums.length;
    }
    static int[] missingNumber2 (int[] nums){
        int i = 0;
        while(i< nums.length){
            if(nums[i] - 1 == i || nums[i] == nums[nums[i]-1]) i++;
            else swapArray(nums,nums[i]-1,i);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int j = 0 ; j < nums.length ;j++){
            if(nums[j] - 1 != j){
                arr.add(j+1);
            }
        }

        int[] ans = new int[arr.size()];
        for(int j = 0 ; j < arr.size(); j++){
            ans[j] = arr.get(j);
        }
        return ans;
    }
    static int findDuplicate(int[] nums){
        int i = 0 ;
        while(i < nums.length){
            if(nums[i] == i+1 || nums[i] == nums[nums[i] - 1]) i++;
            else swapArray(nums,i,nums[i] - 1);
        }

        return nums[nums.length - 1];
    }
    static ArrayList<Integer> findDuplicate2 (int[] nums){
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(i< nums.length){

            if(nums[i] - 1 == i || nums[i] == nums[nums[i]-1]) i++;
            else swapArray(nums,nums[i]-1,i);
        }

        for(int j = 0 ; j < nums.length ;j++){
            if(nums[j] - 1 != j){
                arr.add(nums[j]);
            }
        }

        return arr;
    }

    static int findMissingPositive(int[] nums){
        int i = 0 ;
        while(i< nums.length){
            if(nums[i] <= 0 || nums[i] >= nums.length || nums[i] == i - 1 || nums[i] == nums[nums[i] - 1]) i++;
            else swapArray(nums,i,nums[i] - 1);
        }

        for(i = 0 ; i < nums.length ;i++){
            if(nums[i] - i != 1){
                return i+1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

        System.out.println(findMissingPositive(new int[]  {5,6,7,8}));


    }

}
