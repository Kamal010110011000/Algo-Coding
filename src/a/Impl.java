package a;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface BaseI{ void method();} 

class BaseC{
	public void method() {
		Float f1 = new Float("3.0");
		System.out.println(f1.doubleValue()+f1.byteValue()+f1.intValue());
	}
}

public class Impl{

	  static final Scanner s = new Scanner(System.in);
	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here

	        int t = s.nextInt();
	        int n;
	        int count;
	        int[] d = new int[10];
	        d[0]=0;
	        d[1]=1;
	        for(int i=10, j=2; i<1000000000; i*=10){
	            d[j] = i+(d[j-1]*9);
	            j++;
	        }
	        while(t-- >0){
	            n = s.nextInt();
	            int no = n;
	            count = 0;
	            int mul=10;
	            int m = 1;
	            while(no>0){
	            	
	                count+=getdiff((no%10),mul,m, d);
//	                System.out.println((no%10)*mul+" "+d);
	                mul*=10;
	                no/=10;
	                m++;
	            }
	            System.out.println(n-count);
	        }
	        

	    }

	    static int getdiff(int n,int mul, int m,int[] d ){
	        int count = 0;
	        
	        if(n>3){
	            count+=(mul/10)+d[m-1]*(n-1);
	        }else {
	        	count+=d[m-1]*n;
	        }
	        
	        return count;

	    }
}

