package hackerEarth;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MonkeyGame {

	static final Scanner s = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {
        
        int T = s.nextInt();
        LinkedList<Integer>[] adjList;
        int N,M,src,dest;
        long[] A;
        
        for(int i=0; i<T; i++){
            LinkedList<Integer> test = new LinkedList<>();
            N = s.nextInt();
            M = s.nextInt();
            adjList = new LinkedList[N+1];
            A = new long[N+1];
            for(int k=1; k<N+1; k++){
                adjList[k] = new LinkedList<>();
            }
            for(int k=0; k<M; k++){
                src = s.nextInt();
                dest = s.nextInt();
                adjList[src].add(dest);
                adjList[dest].add(src);
            }
            for(int k=1;k<N+1; k++){
                A[k]=s.nextLong();
                test.add(k);
            }
            boolean[] visited = new boolean[N+1];
            long total=0;
            Stack<Integer> stack = new Stack<>();
            while(!test.isEmpty()){
                stack.push(test.getFirst());
                long newTotal = 0;
                while(!stack.isEmpty()){
                    int node = stack.pop();
                    visited[node]=test.removeFirstOccurrence(node);
                    newTotal+=A[node];
                    LinkedList<Integer> list = adjList[node];
                    for(int r: list){
                        if(!visited[r]){
                            stack.push(r);
                            visited[r]=true;
                        }
                    }
                }
                total=Math.max(total,newTotal);
            }
            System.out.println(total);
        }

    }
}