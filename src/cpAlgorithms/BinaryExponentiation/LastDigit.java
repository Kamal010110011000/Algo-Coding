package cpAlgorithms.BinaryExponentiation;

import java.util.Scanner;

public class LastDigit {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(getLastDigit(a,b));
	}
	
	private static int getLastDigit(int a, int b) {
		int ans = 1;
		int mod = 10;
		if(b==0) {
			return 1;
		}
		while(b>0) {
			if(b%2==1) {
				ans = (ans*a)%mod;
			}
			a = (a * a)%mod;
			b/=2;
		}
		return ans;
	}

}
