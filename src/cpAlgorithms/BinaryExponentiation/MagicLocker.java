package cpAlgorithms.BinaryExponentiation;

import java.util.Scanner;

public class MagicLocker {
	
	final static int mod = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		long[] N = new long[T];
		
		for(int i =0; i<T; i++) {
			N[i] = s.nextLong();
		}
		
		for(int i =0; i<T; i++) {
			long ans = findMax(N[i]);
			System.out.println(ans);
		}
	}
	
	private static long findMax(long N) {
		long ans =1;
		long p=3;
		
		long n = N/3;
		if(N%3==2) {
			ans*=2;
		}
		else if(N%3 == 1) {
			n--;
			ans*=4;
		}
		while(n>0) {
			if(n%2==1 ) {
				ans = (ans*p)%mod;
			}
			p=(p*p)%mod;
			n/=2;
		}
		
		return ans;
	}

}
