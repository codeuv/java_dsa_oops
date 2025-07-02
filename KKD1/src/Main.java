import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, end);

        } else {
            return binarySearch(arr, key, start, mid - 1);

        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        boolean isAscending = arr[start] <= arr[end];
        if (arr[mid] == key) {
            return mid;
        }
        if (isAscending) {
            if (arr[mid] < key) {
                return orderAgnosticBinarySearch(arr, key, mid + 1, end);
            } else {
                return orderAgnosticBinarySearch(arr, key, start, mid - 1);
            }
        } else {
            if (arr[mid] > key) {
                return orderAgnosticBinarySearch(arr, key, mid + 1, end);
            } else {
                return orderAgnosticBinarySearch(arr, key, start, mid - 1);
            }
        }

    }

    static int floor(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return arr[mid];
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
          if(end < 0 ) return arr[0];
//        if(start < 0 || end < 0) return arr[0];
//        if(end >= arr.length || start >= arr.length) return arr[arr.length -1 ];
        return arr[end];
    }

    static int ceil(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return arr[mid];
            } else if (arr[mid] < num) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        if(start < 0 || end < 0) return arr[0];
        if(end >= arr.length || start >= arr.length) return arr[arr.length -1 ];
        return arr[start];
    }

    static int modifiedCiel(int n ){
        int start = 0 ;
        int end = n;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;

            if(mid * mid == n){
                return mid;
            }else if(mid * mid > n){
                end = mid -1 ;
            }else{
                start = mid +1;
            }
        }
        return start;
    }

    static int findFloormissingCount(int[] arr,int k){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/ 2;
            int missingCount = arr[mid] - (mid + 1);

            if(missingCount > k){
                end = mid - 1;
            }else if(missingCount < k){
                start = mid+1;
            }else{
                return start;
            }
        }
        return end < 0 ? 0 : end;

    }

    public static void main (String[] args){
        int arr[] ={1,4,7,12,14};
        for(int i = 0 ;i < 5 ;i++){
            System.out.println(arr[i] - (i+1));
        }
        for(int i = 1 ; i < 10;i++){
            System.out.println(findFloormissingCount(arr,i));
        }


    }
}