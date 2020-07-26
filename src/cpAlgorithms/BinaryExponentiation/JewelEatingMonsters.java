package cpAlgorithms.BinaryExponentiation;

import java.util.Scanner;

public class JewelEatingMonsters {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X = s.nextInt();
		int A = s.nextInt();
		int N = s.nextInt();
		int C = s.nextInt();
		while(N>0) {
			 X = (((X-1)%C)*(A%C))%C;
			 if(X<0) {
				 X+=C;
			 }
			 N--;
		}
		
		System.out.println(X);
	}

}
