package sorting;

import java.util.Scanner;

public class insertion_sort {

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
		for (int i = 1; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
