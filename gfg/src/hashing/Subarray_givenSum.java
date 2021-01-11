package hashing;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Subarray_givenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println(t);
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int sum=sc.nextInt();
			HashSet <Integer> h=new HashSet<>();
			int prefix=0;
			for(int i=0;i<n;i++)
			{
			prefix+=arr[i];
			if(prefix==sum)
			{
				System.out.println("yes");;
				return;	
			}
				if(h.contains(prefix-sum))
			{			System.out.println("yes");;
						return;
			}
				else
					h.add(prefix);
			}
			System.out.println("No");
			
		
		}

	}

}
