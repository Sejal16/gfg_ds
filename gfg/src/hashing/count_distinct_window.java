package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class count_distinct_window {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			
			HashMap<Integer,Integer> h=new HashMap<>();
			
			for(int i=0;i<k;i++)
			{
				h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
			}
			System.out.println(h.size());
			
			for(int i=k;i<n;i++)
			{
				if (h.get(arr[i - k]) == 1) { 
	                h.remove(arr[i - k]); 
	            } 
	  
	            else // reduce count of the removed element 
	                h.put(arr[i - k],  h.get(arr[i - k]) - 1);             
	  
				h.put(arr[i], h.getOrDefault(arr[i], 0) + 1); 
				  
				System.out.println(h.size());
			}
	}

}}
