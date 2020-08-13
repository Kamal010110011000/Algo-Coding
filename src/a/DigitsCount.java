package a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitsCount {
	static final Scanner s = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {

        int t = s.nextInt();
        int M, L, lcount=0, digit_c=0;
        int ans = 0;

        Map<Integer, Integer> map;
        

        while(t-- >0){
            lcount=0;
            digit_c=0;
            ans = 0;
            
            map = new HashMap<>();
//            2,3,4,5,5,5,6,6,6,7
            int[] led = {6,2,5,5,4,5,6,3,7,6};
            Arrays.sort(led);
            L = s.nextInt();
            M = s.nextInt();
            
            lcount = M/7;
            
            for(int i=1; i<L; i++) {
            }

            for(int i=0; i<10; i++){
                for(int j=i; j<Math.min(i+L,10); j++){
                    ans+=find(led,i,j,lcount);
                }
            }

            System.out.println(ans);
        }

    }

    static int find(int[] led, int i, int j, int lcount){
        int avl =0;
        for(int k=i; k<=j; k++){
            avl+=led[k];
        }
        if(avl>lcount){
            return 0;
        }
        return fact(j-i+1);
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    
    
    
//    TestCase
//    4
//    1 14
//    1 50
//    4 28
//    5 700
//    
//    ans
//    1
//    10
//    3
//    32491

    
}
