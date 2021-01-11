package hashing;

import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Pair_present_givenSum {

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
			int sum=sc.nextInt();
			HashSet <Integer> h=new HashSet<>();
			for(int i=0;i<n;i++)
			{
				if(h.contains(sum-arr[i]))
			{			System.out.println("yes");;
						return;
			}
				else
					h.add(arr[i]);
			}
			System.out.println("No");
			
		}

	}

}
