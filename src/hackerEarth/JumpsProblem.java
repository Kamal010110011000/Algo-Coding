package hackerEarth;

import java.util.Scanner;

public class JumpsProblem {
	
	public static int N;
	public static double p2;
	public static double p3;
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		int p = s.nextInt();
		
		p2 = (double)p/100;
		
		p3 = 1 - p2;
		double ans = 0;
		int pos = 0;
		ans+=nextStep(2, 0, p2);
		ans+=nextStep(3, 0, p3);
		
		System.out.printf("%.6f",ans);
		
		
	}
	
	private static double nextStep(int a, int onstep, double p) {
		if(onstep>N) {
			return 0;
		}
		if(onstep==N) {
			return p;
		}
		double leftans = p*nextStep(2,onstep+a,p2);
		double rightans = p*nextStep(3,onstep+a,p3);
		return leftans+rightans;
	}

}
