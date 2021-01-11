package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Topological_sorting {

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
	static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) 
    { 
        int[] indegree = new int[V]; 
      
        for (int u = 0; u < V; u++) { 
            for (int x:adj.get(u)) 
                indegree[x]++; 
        } 
      
			Queue<Integer> q=new LinkedList<>();
			for(int i=0;i<indegree.length;i++)
			{
				if(indegree[i]==0)
				q.add(i);
			}
			
			while(q.isEmpty()!=true)
			{
				int poll=q.poll();
				System.out.println(poll);
				for(int x: adj.get(poll))
				{
					indegree[x]-=1;
					if(indegree[x]==0)
						q.add(x);
					}
				}
			}
			
		


	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	
		adj.get(i).add(j);
		
		
	}
}
	