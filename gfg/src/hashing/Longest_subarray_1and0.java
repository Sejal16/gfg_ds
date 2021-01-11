package hashing;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_subarray_1and0 {

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
			int prefix=0,res=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]==0)
				prefix+=(-1);
				else
					prefix+=1;
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
