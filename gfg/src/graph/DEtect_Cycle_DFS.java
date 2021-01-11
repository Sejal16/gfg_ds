package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DEtect_Cycle_DFS {

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
		System.out.println(DFS(adj,n));
	}
	private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		
		//Undirected graph
		adj.get(i).add(j);
		adj.get(j).add(i);
	}


private static boolean DFS(ArrayList<ArrayList<Integer>> adj, int n) {
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i]==false)
			{
				if(dfs_recc(adj,visited,i,-1)==true)
					return true;
			}
		}
		return false;
		
	
}

private static boolean dfs_recc(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source,int parent) {
visited[source]=true;
//System.out.println(source);
for(int x:adj.get(source))
{
	if(visited[x]==false) {
		if(dfs_recc(adj,visited,x,source)==true)
			return true;
	}
		else if(parent!=x)
			return true;
}return false;

	
}

}
