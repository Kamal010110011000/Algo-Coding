package codeforces.BasicIO.MatrixExponentation;

import java.util.Scanner;

public class StringMood {
	
	 public final static int mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		long[][] a = {{19,7},{6,20}};
		long result[][] = expo_power(a,N);
//		for(int i =0; i<2; i++) {
//			for(int j =0; j<2; j++) {
//				System.out.print(result[i][j]+"  ");
//			}
//			System.out.println();
//		}
		System.out.println(result[0][0]);
//		System.out.println(mod);
		s.close();
				
	}
	
	private static long[][] multiply(long[][] a, long b[][]){
		long product[][] = {{0,0},{0,0}};
		for(int i =0; i<2;i++) {
			for(int j =0; j<2; j++)
				for(int k =0; k<2;k++) {
					product[i][k] += ((a[i][j]%mod) *(b[j][k]%mod))%mod;
				}
		}
		return product;
	}
	
	private static long[][] expo_power(long a[][], long n){
		long result[][] = {{1,0},{0,1}};
		while(n>0) {
			if(n % 2 == 1) {
				result = multiply(result, a);
			}
			n /= 2;
			a = multiply(a,a);
		}
		return result;
	}
	
	
	

}
