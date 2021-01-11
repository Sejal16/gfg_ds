package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class Occurneces_nbyk {

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
			
			for(int i=0;i<n;i++)
				h.put(arr[i],h.getOrDefault(arr[i],0)+1);
			for(Map.Entry<Integer,Integer> e : h.entrySet())
			{
				if(e.getValue()>n/k)
					System.out.println(e.getKey());
			}
	}

}}
