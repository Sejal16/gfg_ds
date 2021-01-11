package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_subaaray_givenSum {

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
			Map<Integer,Integer> h=new HashMap<>();
			int prefix=0,res=0;
			for(int i=0;i<n;i++)
			{
				prefix+=arr[i];
				if(prefix==sum)
				{
					res=i+1;
				}
				if(h.containsKey(prefix)==false)
				{
			h.put(prefix,i);
				}
				if(h.containsKey(prefix-sum))
				{
					res=Math.max(res, i-h.get(prefix-sum));
				}
				
			}
System.out.println(res);
}
}
}