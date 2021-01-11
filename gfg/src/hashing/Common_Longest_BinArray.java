package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Common_Longest_BinArray {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PrintWriter out=new PrintWriter(System.out);
			int t = sc.nextInt();
			while (t-- > 0) {
				int n = sc.nextInt();
				int arr[]=new int[n];
				int arr1[]=new int[n];
				int temp[]=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++)
				{
					arr1[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++)
				{
					temp[i]=arr[i]-arr1[i];
				}
				
				Map<Integer,Integer> h=new HashMap<>();
				int prefix=0,res=0;
				for(int i=0;i<n;i++)
				{
					prefix+=temp[i];
					if(prefix==0)
					{
						res=i+1;
					}
					if(h.containsKey(prefix)==false)
					{
				h.put(prefix,i);
					}else
					
					{
						res=Math.max(res, i-h.get(prefix));
					}
					
				}
	System.out.println(res);
	}
		

	}

}
