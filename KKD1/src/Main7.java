import java.util.ArrayList;
import java.util.Arrays;

public class Main7 {
    //Merge sort and quick sort
    static int[] mergesort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] nums1 , int[] nums2){
        int[] ans = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        int i = 0 ;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]){
                ans[i++] = nums1[p1++];
            }else{
                ans[i++] = nums2[p2++];
            }
        }
        if(p1 == nums1.length){
            for(int j = p2 ; j < nums2.length ;j++){
                ans[i++] = nums2[j];
            }
        }else if(p2 == nums2.length){
            for(int j = p1 ; j < nums1.length ;j++){
                ans[i++] = nums1[j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={8,7,6,4,3,2,1,0,98};
//      {1,2,43,21,121,12,121,121,121,3,4,6,7,8};
        int[] ans = merge(new int[]{1,2,3,4,5,6},new int[]{1,2,3,4,4,5,123,12});
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(mergesort(arr)));
    }

}
