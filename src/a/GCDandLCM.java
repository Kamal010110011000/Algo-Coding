package a;

public class GCDandLCM {
	
	public static void main(String[] args) {
		int a = 120;
		int b = 140;
		
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
//		int gcd = GCD(a, b);
//		int lcm = lcm(a,b);
//		
//		System.out.println(gcd+" "+lcm);
//		Subset Generate
//		int N = 4;
//
//		int allMasks = (1 << N);
//		for (int i = 1; i < allMasks; i++)
//		{
//		    for (int j = 0; j < N; j++)
//		    if ((i & (1 << j)) > 0)           //The j-th element is used
//		        System.out.print(j + " ");
//		
//		    System.out.println();
//		}
		
		


		
	}
	
	static int GCD(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return GCD(b,a%b);
	}
	
	static int lcm(int a, int b) {
		return a/GCD(a,b)*b;
	}

}
