package cpAlgorithms.BinaryExponentiation;

import java.util.Scanner;

public class ModEX {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int n = s.nextInt();
		int m = s.nextInt();
		x %= m;
		int res = 1;
		while(n>0) {
			if(n%2 == 1) {
				res = res * x % m;
			}
			x = (x * x)%m;
			n/=2;
		}
		System.out.println(res);
	}

}
