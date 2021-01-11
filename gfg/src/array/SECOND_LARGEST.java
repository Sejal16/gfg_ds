package array;

import java.util.Scanner;

public class SECOND_LARGEST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int pos=large(arr,n);
		if(pos==-1)
			System.out.println("No second large number present");
		else
		System.out.println("second largest number: "+arr[pos]);
		}

	

	public static int large(int[] arr, int n) {
		int res=-1,largest=0;
		for(int i=1;i<n;i++)
		{
			if(arr[largest]<arr[i])
			{
				res=largest;
				largest=i;
			}
			else if(arr[largest]>arr[i]) {
			if(res==-1 || arr[res]<arr[i])
			{
				res=i;
			}
		}}
		return res;
	}}


