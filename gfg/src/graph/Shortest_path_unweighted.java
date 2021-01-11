package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Shortest_path_unweighted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of vertices:");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>> (n);
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		addElement(adj,0,1);
		addElement(adj,0,2);
		addElement(adj,0,5);
		addElement(adj,1,3);
		addElement(adj,2,4);
		addElement(adj,3,5);
		addElement(adj,4,5);
		System.out.println("enter source");
		int source=sc.nextInt();
		BFS_print(adj,n,source);

	}

private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
	//Undirected graph
	adj.get(i).add(j);
	adj.get(j).add(i);
}
private static void BFS_print(ArrayList<ArrayList<Integer>> adj, int n, int source) {
	boolean visited[]=new boolean[n+1];
	Queue<Integer> q=new LinkedList<>();
	 int dist[]=new int[n];
	 dist[source]=0;
	q.add(source);
	visited[source]=true;
	while(q.isEmpty()!=true)
	{
		int poll=q.poll();
		//System.out.println(poll);
		for(int x: adj.get(poll))
		{
			if(visited[x]==false)
			{
				dist[x]=dist[poll]+1;
				visited[x]=true;
				q.add(x);
			}
		}
	}
	// printing
	for(int i =0;i<dist.length;i++)
		System.out.println(dist[i]);
	
}
}
