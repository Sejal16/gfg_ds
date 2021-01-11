package graph;

import java.util.ArrayList;
import java.util.*;

public class DFs_simpleVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of vertices:");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>> (n);
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		addElement(adj,0,1);
		addElement(adj,0,2);
		addElement(adj,1,3);
		addElement(adj,1,4);
		addElement(adj,2,3);
		addElement(adj,3,4);
		//addElement(adj,3,4);
		
		System.out.println("enter source");
		int source=sc.nextInt();
		DFS(adj,n,source);
		}


private static void DFS(ArrayList<ArrayList<Integer>> adj, int n, int source) {
		boolean visited[]=new boolean[n];
		dfs_print(adj,visited,source);
		
	}


private static void dfs_print(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source) {
visited[source]=true;
System.out.println(source);
for(int x:adj.get(source))
{
	if(visited[x]==false)
		dfs_print(adj,visited,x);
}

	
}


private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
	//Undirected graph
	adj.get(i).add(j);
	adj.get(j).add(i);
}


}
