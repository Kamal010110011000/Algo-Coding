package cpAlgorithms.BinaryExponentiation;

import java.util.Scanner;

//For two given integers n and k find (Zn + Zn-1 - 2Zn-2) mod 10000007, where Zn = Sn + Pn and 
//Sn = 1^k + 2^k + 3^k + … + n^k and Pn = 1^1 + 2^2 + 3^3 + … + n^n.
public class JustAdd {
	
	final static int mod = 10000007;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int K = s.nextInt();
		
		int ans = Z(N,K);
		System.out.println(ans);
	}
	
	private static int Z(int N, int k) {
		
		int ans = P(N)%mod+S(N, k)%mod+(2*P(N-1))%mod+(2*S(N-1, k))%mod;
		
		return ans%mod;
		
	}
	
	private static int P(int N) {
		int n = N;
		int ans = 1;
		
		while(n>0) {
			if(n%2==1) {
				ans = ((ans%mod)*(N%mod))%mod;
			}
			N = ((N%mod)*(N%mod))%mod;
			n/=2;
		}
		return ans;
				
	}
	
	private static int S(int N, int k) {
		int ans = 1;
		while(k>0) {
			if(k%2==1) {
				ans = ((ans%mod)*(N%mod))%mod;
			}
			N = ((N%mod)*(N%mod))%mod;
			k/=2;
		}
		return ans;
	}

}
