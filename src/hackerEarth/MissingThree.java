package hackerEarth;

import java.util.Scanner;
import java.util.Stack;

public class MissingThree {
	
	public static void main(String[] args) {
       

        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i =0; i<T; i++){
            int N = s.nextInt();
            solve(N);
        }
    }

    private static void solve(int N){
    	
    	Stack<Integer> stack = new Stack<>();
    	stack.push(1);
        int ans = 0;
        int base = 1;
        int ad = 10;
        for(int i = 3 ; i<=N; i+=ad){
        	
        	
            if(i/ad == 3){
                ans+=ad;
                continue;
            }
            if(i/ad >= 10){
                base = ans;
                stack.push(base);
                ad *=10; 
            }
            
                ans+=base;
                if(i+ad>N && (i+ad)%ad>(ad/10)) {
            		base = stack.pop();
            		ad/=10;
            	}
        }
        System.out.println(N-ans);
    }
}

