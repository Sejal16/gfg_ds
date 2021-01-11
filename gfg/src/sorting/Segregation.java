package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Segregation {

	public static void main(String[] args) {
		//segregation can be done 
		//here we are dividing array into two parts
//		even odd
//		1 and 0
//		positive negative
//		only thing that will change is the conditions
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		hoares(arr,n);
		System.out.println("odd and even"+Arrays.toString(arr));
		
		int arr1[]=new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		Lomuto(arr1,n);
		System.out.println("negative and positive"+Arrays.toString(arr1));
	}

	private static void hoares(int[] arr, int n) {
		
		int i=-1, j=n;
		while(true)
		{
			do {
				i++;
			}while(arr[i]%2!=0);
			do {
				j--;
			}while(arr[j]%2==0);
			if(i>=j)
				return;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
	}

	private static void Lomuto(int[] arr1, int n) {
		int i=-1;
		for(int j=0;j<n;j++)
		{
			if(arr1[j]<0) {
				i++;
			int temp=arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=temp;
			
		}
		}	}

}
