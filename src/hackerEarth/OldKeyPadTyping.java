package hackerEarth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class OldKeyPadTyping {
	static final Scanner s = new Scanner(System.in);
    static LinkedList<Character>[][] keys = new LinkedList[4][3];
    static Map<Character,Integer> map = new HashMap<>();
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
        char[] arr;
        int ans=0;

        keys[0][0] = new LinkedList<>(Arrays.asList('.',',','?','!','1'));
        keys[0][1] = new LinkedList<>(Arrays.asList('a','b','c','2'));
        keys[0][2] = new LinkedList<>(Arrays.asList('d','e','f','3'));
        keys[1][0] = new LinkedList<>(Arrays.asList('g','h','i','4'));
        keys[1][1] = new LinkedList<>(Arrays.asList('j','k','l','5'));
        keys[1][2] = new LinkedList<>(Arrays.asList('m','n','o','6'));
        keys[2][0] = new LinkedList<>(Arrays.asList('p','q','r','s','7'));
        keys[2][1] = new LinkedList<>(Arrays.asList('t','u','v','8'));
        keys[2][2] = new LinkedList<>(Arrays.asList('w','x','y','z','9'));
        keys[3][1] = new LinkedList<>(Arrays.asList('_','0'));

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(char c: keys[i][j]){
                    map.put(c,i*3+j+1);
                }
            }
        }
        map.put('_', 11);
        map.put('0', 11);

        while(t-- >0){
        	ans =0;
            arr = s.next().toCharArray();
            int pos =1;
            for(char c: arr){
                int p = map.get(c);
                ans+=keys[(p-1)/3][(p-1)%3].indexOf(c)+1;
                int x1=(pos-1)/3;
                int y1=(pos-1)%3;
                int x2=(p-1)/3;
                int y2=(p-1)%3;
                ans+=Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
                pos = p;
            }
            
            System.out.println(ans);
        }
        


    }

    

}
