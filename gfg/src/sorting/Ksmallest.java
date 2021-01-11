package sorting;

import java.util.Scanner;

public class Ksmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=ksmall(arr,n,k,0,n-1);
		if(res==-1)
			System.out.println("out of range");
		else
			System.out.println(arr[res]);
		}
	
	//	QUICK SELECT
	
	private static int ksmall(int[] arr, int n, int k, int left, int right) {
		while(left<=right)
		{
			int p=partition(arr,left,right);
			if(p==k-1)
				return p;
			else if(p>k-1)
			right=p-1;
			else
				left=p+1;
			
				
		}
		
		return -1;
	}

	static int partition(int[] arr, int l, int h) {
	 	
		 int pivot=arr[h];
		 int i=l-1;
		 for(int j=l;j<=h-1;j++)
		 {
			
			 if(arr[j]<pivot)
			 { i++;
				 swap(arr,i,j);
			 }
		 }
		 swap(arr,i+1,h);
		 return i+1;
			 }

	private static void swap(int arr[],int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
