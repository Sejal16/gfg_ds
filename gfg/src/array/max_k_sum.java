package array;

import java.util.Scanner;

public class max_k_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			//use sliding window technique
			int sum=0;
			for (int i=0;i<k;i++)
			{
				sum+=arr[i];
			}
			int max_sum=sum;
			for(int i=k;i<n;i++)
			{
				sum+=(arr[i]-arr[i-k]);
				max_sum=Math.max(max_sum, sum);
			}
			System.out.println(max_sum);
	}

}}
