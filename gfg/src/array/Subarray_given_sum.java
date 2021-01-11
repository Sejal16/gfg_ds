package array;

import java.util.Scanner;

public class Subarray_given_sum {

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
			int sum=sc.nextInt();
			System.out.println(isSubSum(arr,n,sum));
			
		}
	}
static boolean isSubSum(int[] arr, int n,int sum) {
		
		//use sliding window technique
		int curr_sum=arr[0];
		int start=0;
		for(int end=1;end<n;end++)
		{
			while(curr_sum>sum && start<end-1)
			{
				curr_sum-=arr[start];
				start++;
			}
			if(curr_sum==sum)
				return true;
			if(end<n)
				curr_sum+=arr[end];
		}
		return curr_sum==sum;
	
	}

}
