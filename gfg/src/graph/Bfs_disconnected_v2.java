package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs_disconnected_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of vertices:");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>> (n);
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3); 
    	addEdge(adj,4,5);
    	addEdge(adj,5,6);
    	addEdge(adj,4,6);
		
		BFS_dis(adj,n);
		
		}
	
private static void BFS_dis(ArrayList<ArrayList<Integer>> adj, int n) {
	int c=0;
	boolean visited[]=new boolean[n+1];
	for(int i=0;i<n;i++)
	{
		if(visited[i]==false)
		{
			c++;
			BFS_print(adj,n,i,visited);			
	}}
System.out.println("Connected graphs: "+ c);
		
	}

private static void BFS_print(ArrayList<ArrayList<Integer>> adj, int n, int source,boolean visited[]) {
	
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visited[source]=true;
		while(q.isEmpty()!=true)
		{
			int poll=q.poll();
			System.out.println(poll);
			for(int x: adj.get(poll))
			{
				if(visited[x]==false)
				{
					visited[x]=true;
					q.add(x);
				}
			}
		}
		
	}


private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
	//Undirected graph
	adj.get(i).add(j);
	adj.get(j).add(i);
}

}