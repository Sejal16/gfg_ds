package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate0s1s2s {

	public static void main(String[] args) {
		//segregation can be done 
		//here we are dividing array into  THREE parts
//				0 1 2
//				RANGE SEGREGATION
//				positive negative
//				MULTPLE PIVOT
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int arr[]=new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i]=sc.nextInt();
				}
				
				//ALGORITHM USED- DUTCH NATIONAL FLAG
				segregation(arr,n);
				System.out.println(Arrays.toString(arr));
				
	}

	private static void segregation(int[] arr, int n) {
		int i=0,mid=0,high=n-1;
		while(mid<=high)
	{
			if(arr[mid]==0)
			{
				swap(arr,mid,i);
				i++;
				mid++;
			}
			else if(arr[mid]==2)
			{
				swap(arr,mid,high);
				high--;
			}
			else {
			mid++;
			}
			}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
