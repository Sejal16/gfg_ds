package graph;
import java.util.*;
import java.io.*;
import java.lang.*;
public class BFS_version1 {

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
	
private static void BFS_print(ArrayList<ArrayList<Integer>> adj, int n, int source) {
		boolean visited[]=new boolean[n+1];
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

private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
	//Undirected graph
	adj.get(i).add(j);
	adj.get(j).add(i);
}

}
