package graph;

import java.util.*;
import java.io.*;
import java.lang.*;
public class Inplementing_graph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
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


print(adj);
		}
	}

	private static void print(ArrayList<ArrayList<Integer>> adj) {
		
		for(int i=0;i<adj.size();i++)
		{
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

	private static void addElement(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		
		//Undirected graph
		adj.get(i).add(j);
		adj.get(j).add(i);
	}

}
