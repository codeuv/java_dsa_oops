import java.util.ArrayList;
import java.util.Arrays;

public class Main4 {
    static boolean isPrime(int number){
        if (number <= 1) return false;

        for( int i = 2 ; i * i <= number ;i++){
            if(number % i == 0) return false;
        }
        return true;
    }
    static void sieve(int number){
        boolean[] primeTable = new boolean[number + 1];


        for(int i = 2 ; i < primeTable.length ; i++){
            if(!primeTable[i]){
                for(int j = i + i  ; j < primeTable.length ; j+=i) primeTable[j] = true;
            }
        }
        for(int i = 2 ; i < primeTable.length;i++){
            if(!primeTable[i]){
                System.out.println(i);
            }
        }

    }
    static double sqrt(int n ,int p){
        int s = 0 ;
        int e = n ;
        int m;
        while(s<=e){
            m = s+(e-s)/2;
            if(m * m == n){
                return m;
            }else if(m * m > n){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }

//        System.out.println(e);
        // e is the floor srqrt of n;
        double root = e;
        double incr = 0.1;
        for (int i = 0 ; i < p ;i++){
            for(int j = 0 ; j < 10 ;j++){
                root+=incr;
                if(root * root > n){
                    root-=incr;
                }
            }
            incr /= 10;
        }
        return root;
    }
    static void factor(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1 ; i <= Math.sqrt(n);i++){
            if(n % i == 0) {
                if( n / i == i) ans.add(i);
                else {
                    ans.add(i);
                    ans.add(n / i);
                }
            }
        }


        int[] sortedAns = new int[ans.size()];
        int j = 0 ;
        for(int i = 0 ; i < ans.size() ;i+=2){
            sortedAns[j] = ans.get(i);
            j++;
        }
        for(int i = ans.size() -2 ;i > 0 ;i-=2){
            sortedAns[j] = ans.get(i);
            j++;
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(sortedAns));
    }
    static int hcf(int a , int b){
//        if(a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
        if(a==0) return b;
        else return hcf(b % a,a);
    }

    static int lcm (int a , int b){
        return  (a * b)/hcf(a,b);
    }
    public static void main(String[] args) {
        System.out.println(hcf(10,25));
        System.out.println(lcm(10,25));

    }
}
