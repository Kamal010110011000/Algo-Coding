package codeforces.BasicIO;

import java.util.Scanner;

public class ParkingLot {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		long K = N -2 + 1;
		long C = 4;
		long ans = 0;
		for(long i =0; i<K; i++) {
			if(i>0 && i<K-1) {
				ans+=(C-1)*(C-1)*POW(C,K-2);
			}else {
				ans+=(C-1)*POW(C,K-1);
			}
			
		}
		
		System.out.println(ans);
		
		s.close();
	}
	
	private static long POW(long a, long b) {
		
		long ans = 1;
		while(b>0) {
			if(b%2==1) {
				ans*=a;
			}
			a*=a;
			b/=2;
		}
		return ans;
	}
	

}
