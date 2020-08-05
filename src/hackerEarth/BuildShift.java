package hackerEarth;

import java.util.Scanner;
import java.util.Stack;

public class BuildShift {
	
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

        int T = s.nextInt();
        long N,M;
        for(int k =0; k<T; k++){
            N = s.nextLong();
            M = s.nextLong();
            int i=0;
            Stack<String> stack = new Stack<>();
            while(M>0){
                long a = M&1;
                if(a==1){
                    stack.push("("+N+"<<"+i+")");
                }
                i++;
                M>>=1;
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
                if(stack.size()!=0){
                	System.out.print(" + ");
                }            
            }
            System.out.println();
        }


    }

}
