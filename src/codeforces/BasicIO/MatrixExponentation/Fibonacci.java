package codeforces.BasicIO.MatrixExponentation;

import java.util.Scanner;

public class Fibonacci {
	
	public final static long mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long fib[] = {0,1};
		long N = s.nextLong();
		long[][] P = {{0,1},{1,1}};
		while(N>0) {
			if(N%2==1) {
				fib = multiply(fib,P);
			}
			P = multiply2(P, P);
			N /= 2;
		}
		System.out.println(fib[0]);
		
		
	}
	
	private static long[] multiply(long[] a, long[][] b) {
		long[] product = {0,0};
		product[0] = (a[0]*b[0][0] + a[1]*b[1][0])%mod;
		product[1] = (a[0]*b[0][1] + a[1]*b[1][1])%mod;
		return product;
	}
	
	private static long[][] multiply2(long[][] a, long b[][]){
		long product[][] = {{0,0},{0,0}};
		for(int i =0; i<2;i++) {
			for(int j =0; j<2; j++)
				for(int k =0; k<2;k++) {
					product[i][k] += ((a[i][j]%mod) *(b[j][k]%mod))%mod;
				}
		}
		return product;
	}

}
