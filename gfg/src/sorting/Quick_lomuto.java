package sorting;

import java.util.Scanner;

public class Quick_lomuto {

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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

 static void Qsort(int[] arr, int l, int h) {
		if(l<h)
		{
			int p=partition(arr,l,h);
			Qsort(arr,l,p-1);
			Qsort(arr,p+1,h);
		}
		
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


