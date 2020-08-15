package a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BridgesInGraph {
	static final Scanner s = new Scanner(System.in);
	static int time =0;
	public static void main(String[] args) {
		int n = s.nextInt();
		int src,dest;
		LinkedList<Integer>[] adjList = new LinkedList[n+1];
		for(int i=1; i<n+1; i++) {
			adjList[i] = new LinkedList<>();
		}
		int k = s.nextInt();
		for(int i=0; i<k; i++) {
			src = s.nextInt();
			dest = s.nextInt();
			adjList[src].add(dest);
			adjList[dest].add(src);
		}
		bridge(n,adjList);

	}
	
	static void bridgeUtil(int src, boolean[] visited, int[] desc, int[] low, int[] parent, LinkedList<Integer>[] adjList) {
		visited[src] = true;
		
		desc[src] = low[src] = ++time;
		
		Iterator<Integer> i = adjList[src].iterator();
		
		while(i.hasNext()) {
			int v= i.next();
			
			if(!visited[v]) {
				parent[v] = src;
				bridgeUtil(v,visited, desc,low,parent,adjList);
				
				low[src] = Math.min(low[src], low[v]);
				
				if(low[v]>desc[src]) {
					System.out.println(src+" "+v);
				}
				
			}else if(v != parent[src]) {
				low[src] = Math.min(low[src], desc[v]);
			}
		}
	}
	
	static void bridge(int n, LinkedList<Integer>[] adjList) {
		boolean[] visited = new boolean[n+1];
		int[] low = new int[n+1];
		int[] desc = new int[n+1];
		int[] parent = new int[n+1];
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				bridgeUtil(i,visited,desc,low,parent,adjList);
			}
		}
	}

}
