package sorting;

import java.util.Scanner;

public class Quick_hoares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Qsort(arr,0,n-1);
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
	}
		static void Qsort(int[] arr, int l, int h) {
			if(l<h)
			{
				int p=partition(arr,l,h);
				Qsort(arr,l,p);
				Qsort(arr,p+1,h);
			}
			
		}

	 static int partition(int[] arr, int l, int h) {
		 	
		 int pivot=arr[l];
		 int i=l-1;
		 int j=h+1;
		
		 while(true)
		 {
			 do {
				 i++;
			 }while(arr[i]<pivot);
			 do {
				 j--;
			 }
				 while(arr[j]>pivot);
			 if (j<=i)
				 return j;
			 swap(arr,i,j);
			 }
		 }
		 
		 
		 
		 
	private static void swap(int arr[],int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
		 
}
