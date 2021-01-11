package graph;
import java.util.*;
import java.io.*;
import java.lang.*;

class graph{
	int des,weight;
	graph(int des,int weight)
	{
		this.des=des;
		this.weight=weight;
	}
	public int getDes() {
		return des;
	}
	
	public int getWeight() {
		return weight;
	}
}

public class Shortest_Path_DAG {

	int v;
	 LinkedList<graph> adj[];
	Shortest_Path_DAG(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<graph>();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of vertices");
			int v = sc.nextInt();
			Shortest_Path_DAG g=new Shortest_Path_DAG(v);
		System.out.println("Enter source");
		int s=sc.nextInt();	
		 g.addEdge(0, 1, 2);
	        g.addEdge(0, 4, 1);
	        g.addEdge(1, 2, 3);
	        g.addEdge(4, 2, 2);
	        g.addEdge(4, 5, 4);
	        g.addEdge(2, 3, 6);
	        g.addEdge(5, 3, 1);
		g.path(s);
			
	
	}
	void path(int s) {
		boolean visited[]=new boolean[v];
		Stack<Integer> stack=new Stack<>();
	int 	dist[]=new int[v];
	for(int i=0;i<v;i++)
		dist[i]=Integer.MAX_VALUE;
	dist[s]=0;
	for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				topological(visited,stack,i);
			}
		}
		while(stack.empty()==false)
		{
		int u=stack.pop();
		Iterator<graph> it;
	
			 it=adj[u].iterator();
		while(it.hasNext()) {
			graph node=it.next();
		if(dist[node.getDes()]>dist[u]+node.getWeight())
			dist[node.getDes()]=dist[u]+node.getWeight();
		}}
	

        for (int i = 0; i < v; i++)
        {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print( "INF ");
            else
                System.out.print( dist[i] + " ");
        }
	}
	private void topological(boolean[] visited, Stack<Integer> stack, int i) {
		visited[i]=true;
		Iterator<graph> it=adj[i].iterator();
		while(it.hasNext())
		{
			graph node=it.next();
			if(visited[node.getDes()]==false)
				topological(visited,stack,node.getDes());
				
		}
		stack.add(v);
	}
	void addEdge(int u,int v,int weight)
	{
		graph node=new graph(v,weight);
		adj[u].add(node);
	}
	}
	


