package hashing;

import java.io.PrintWriter;
import java.util.*;
import java.io.*;
public class Array_frquency {

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
			Map<Integer,Integer> h=new HashMap<>();
			for(int i=0;i<n;i++) {
				h.put(arr[i], h.getOrDefault(arr[i],0)+1);
			}
			 for(Map.Entry<Integer, Integer> itr: h.entrySet()) 
			        System.out.println(itr.getKey() + " " + itr.getValue());
			    }
	

}
}
