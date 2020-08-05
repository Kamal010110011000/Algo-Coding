package hackerEarth;

import java.util.Scanner;

public class MinAndMaxWins {
	static final Scanner s = new Scanner(System.in);
    static final int mod = 1000000007;
	
	public static void main(String[]  args) {
		int T = s.nextInt();
        int N;
        long total, total2,min=0, max =0;
        for(int k =0; k<T; k++){
            N = s.nextInt();
            total = N*(N-1)/2;
            total2 =total;
            for(int i=N-1; total>0; i--){
                if(total>i){
                    max += Math.pow(i,2)%mod; 
                    max %=mod; 
                }else {
                	max += Math.pow(total,2)%mod; 
                    max %=mod;
                }
                total-=i;
            }
            if(total2%N!=0){
                long t = total2%N;
                min = ((t%mod)*((long)Math.pow((total2/N)+1,2)%mod))%mod;
                min = min + (((N-t)%mod)*((long)Math.pow(total2/N,2)%mod))%mod;
            }else{
                min = ((N%mod)*((long)Math.pow(total2/N,2)%mod))%mod;
            }
            System.out.println(min +" "+max);
        }

    
	}

}
