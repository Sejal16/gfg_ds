package array;

import java.util.Scanner;

public class left_rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter by hoe many time we need to rotate");
		int d=sc.nextInt();
		if(d>arr.length)
			d=d-arr.length;
		
		rotate(arr,d);
		System.out.println();
		rotate_efficient(arr,d,n);
	
	}
	
	//TIME COMPLEXITY: O(N) SC:O(d)

	public static void rotate(int[] arr, int d) {
		int temp[]=new int[d];

		for (int i = 0; i < d; i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<arr.length;i++)
			arr[i-d]=arr[i];
		for (int i = 0; i < d; i++) {
			arr[arr.length-d+i]=temp[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
// TC:O(n) SC:O(1)

		public static void rotate_efficient(int[] arr, int d, int n) {
			
			reverse(arr,0,d-1);
			reverse(arr,d,n-1);
			reverse(arr,0,n-1);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

public static void reverse(int[] arr, int low, int high) {
	while(low<high)
	{
		swap(arr,low,high);
		low++;
		high--;
	}
}

public static void swap(int arr[],int low, int high) {
	int temp=arr[low];
	arr[low]=arr[high];
	arr[high]=temp;
}

		}

