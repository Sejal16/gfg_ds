package hashing;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Longest_subsequence {

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
			HashSet <Integer> h=new HashSet<>();
			for(int i=0;i<n;i++)
			{
				h.add(arr[i]);
			}
			int curr=1,res=0;
			for(int i=0;i<n;i++)
			{
				if(h.contains(arr[i]-1))
					curr=1;
				else
				{
					while(h.contains(arr[i]+curr))
					curr++;
				}
				res=Math.max(res, curr);
			}
			System.out.println(res);
	}

}}
