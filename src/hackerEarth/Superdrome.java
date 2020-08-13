package hackerEarth;


import java.util.List;
import java.util.Scanner;

public class Superdrome {
	static List<Integer> list;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
        int T = scann.nextInt();
        for(int t_i=0; t_i<T; t_i++)
        {
            int n = scann.nextInt();

            int out_ = solve(n);
            System.out.print(out_);
            System.out.print(" ");
         }

         scann.close();
    }
    static int solve(int n){
    	
        int count=0;
        for(int i=1; i<=n; i++){
            if(isSuperdrome(i) && isbinaryPalandrome(i)){
                count++;
            }
        }
        return count;
    }

    static boolean isSuperdrome(int n){
        int N = n;
        int temp = 0;
        while(N>0){
            temp = temp*10+N%10;
            N/=10;
        }
        return n==temp;
    }

    static boolean isbinaryPalandrome(int n){
    	if((n&1)==0) {
    		return false;
    	}
        int b = n>>1;
        int t2 = 1;
        while(b>0){
            t2<<=(b&1);
            t2=((b&1)==1)?t2|1:t2;
            b>>=1;
        }
        return n==t2;
    }

}
