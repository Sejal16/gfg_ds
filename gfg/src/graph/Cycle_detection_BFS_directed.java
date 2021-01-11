package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cycle_detection_BFS_directed {

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
		
		cycle_detect(adj,n);
	}

	

	
private static void cycle_detect(ArrayList<ArrayList<Integer>> adj, int n) {
	 int[] indegree = new int[n]; 
     
     for (int u = 0; u < n; u++) { 
         for (int x:adj.get(u)) 
             indegree[x]++; 
     } 
   int c=0;
			Queue<Integer> q=new LinkedList<>();
			for(int i=0;i<indegree.length;i++)
			{
				if(indegree[i]==0)
				q.add(i);
			}
			
			while(q.isEmpty()!=true)
			{
				c++;
				int poll=q.poll();
				System.out.println(poll);
				for(int x: adj.get(poll))
				{
					indegree[x]-=1;
					if(indegree[x]==0)
						q.add(x);
					}
				}
			if(c!=n)
				System.out.println("YES");
			else
				System.out.println("Np");
			}	
	

private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
	

	adj.get(i).add(j);
	
}

}
