package hackerEarth;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Strings can be efficiently stored as a data structure, to have efficient searching methods.
//A new startup is going to use this method, but they don't have much space. So they want to check 
//beforehand how much memory will be required for their data.
//Following method describes the way in which this startup's engineers save the data in the structure.
//Suppose they have 5 strings/words: et,eq,bd,be,bdp
//find no of nodes
//initially -> NULL
// first String ->  NULL
//					 |
//					 e
//					 |
//					 t

//Second String ->  NULL
//					 |
//					 e
//					/ \
//				   t   q

//Thirf String ->   NULL
//					/  \
//				   e    b
//				  / \	|
//				 t   q  e

//Final String ->   NULL
//					/   \
//				   e     b
//				  / \	/  \
//				 t   q  e   d
//						    |
//							p
public class BuildTree {
	static Scanner s = new Scanner(System.in);
	int nodes = 0;
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

        int n = s.nextInt();
        String str;

//        for(int i=0; i<n; i++){
//            str[i] = s.next();
//        }
//        
//        Arrays.sort(str);
        
        Node node = new Node('N');
        
        for(int i=0; i<n; i++) {
        	
        }
        
        

    }
    
    public static boolean insert(String str,Node node, int pos) {
    	Node temp = node;
    	if(pos==str.length()) {
    		return true;
    	}
    	if(!node.next.contains(str.charAt(pos))) {
    		Node newN = new Node(str.charAt(pos));
    		node.next.add(newN);
    		insert(str,newN,pos+1);
    	}else {
    		LinkedList<Node> list = node.next;
    		for(Node n:list) {
    			
    		}
    	}
    	
    	return true;
    }

    static class Node{
    	char c;
    	int size;
    	LinkedList<Node> next;
    	public Node(char c) {
    		this.c = c;
    		next = new LinkedList<>();
    	}
    	
    	
    	
    }



}
