package array;

import java.util.Scanner;

public class subarray_even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for (int i = 0; i < arr.length; i++) 
				arr[i]=sc.nextInt();
			naive(arr,n);
			efficient(arr,n);
		}
		}
	public static void naive(int[] arr, int n) {
		int res=1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
				count++;
				else
					break;
			}
			res=Math.max(res,count);
		}
		System.out.println(res);
		
	}

	public static void efficient(int[] arr, int n) {
		int count=1,res=1;
		for(int i=n-2;i>=0;i--)
		{
			if((arr[i] % 2 == 0 && arr[i+1] % 2 != 0) ||(arr[i] % 2 != 0 && arr[i+1] % 2 == 0))
			{
				count++;
				res=Math.max(res, count);
			}
			else
			{
				count=1;
			}
		}
		System.out.println(res);
	}

}
