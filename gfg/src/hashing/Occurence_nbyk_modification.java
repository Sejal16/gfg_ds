package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurence_nbyk_modification {

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
			
			HashMap<Integer,Integer> h=new HashMap<>(k-1);
			
			for(int i=0;i<n;i++)
			{
				if(h.containsKey(arr[i]))
					h.put(arr[i],h.get(arr[i])+1);
				else if(h.size()<k-1)
					h.put(arr[i], 1);
				else
				{
					for(Map.Entry<Integer, Integer> e: h.entrySet())
					{
						h.put(e.getKey(), e.getValue()-1);
						if(e.getValue()==0)
							h.remove(e.getKey());
					}
				}
			}
			
			
			for(Map.Entry<Integer,Integer> e : h.entrySet())
			{
				if(e.getValue()>n/k)
					System.out.println(e.getKey());
			}

	}

}}
