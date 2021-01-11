package array;

import java.util.Scanner;

public class leader_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[n-1]);
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.println(max);
			}
		}

	}

}
