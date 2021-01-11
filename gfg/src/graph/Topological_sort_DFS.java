package graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Topological_sort_DFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of vertices:");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>> (n);
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0, 2); 
        addEdge(adj,0, 3); 
        addEdge(adj,1, 3); 
        addEdge(adj,1, 4); 
        addEdge(adj,2, 3);
		
    	topologicalSort(adj,n);
	}
	private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int n) {
	boolean visited[]=new boolean[n];
	Stack<Integer> s=new Stack<>();
	  for(int u=0;u<n;u++){
          if(visited[u]==false){
        	  dfs_rec(adj,visited,u,s);
          }}
	
	}
	private static void dfs_rec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source, Stack<Integer> s) {
		visited[source]=true;
		System.out.println(source);
		for(int x:adj.get(source))
		{
			if(visited[x]==false)
				dfs_rec(adj,visited,x,s);
		}
		  while (s.empty() == false) 
	            System.out.print(s.pop() + " "); 
			
		}

private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
	adj.get(i).add(j);
	
	
}
}
