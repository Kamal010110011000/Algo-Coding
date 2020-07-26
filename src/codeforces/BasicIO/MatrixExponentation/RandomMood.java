package codeforces.BasicIO.MatrixExponentation;

import java.util.Scanner;

public class RandomMood {

	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		
		int T = s.nextInt();
		double P = s.nextDouble();
		double prob_happy = 1.0;
		while(T>0) {
			if(T%2 == 1) {
				prob_happy = prob_happy *(1 - P) + (1- prob_happy) *P; 
			}
			P = P*(1-P)+(1-P)*P;
			T/=2;
		}
		
		System.out.printf("%.9f",prob_happy);
		
		
		s.close();
	}
}
