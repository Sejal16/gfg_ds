package sorting;

import java.util.*;

public class choco_distribution {

	public static void main(String[] args) {
		//Tc :  O(n log n)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		if(m>n) {
			System.out.println("not in range");
			return ;
		}
		Arrays.parallelSort(arr);;
		int res=arr[m-1]-arr[0];
		for(int i=1;i+m-1<n;i++)
			res=Math.min(res, arr[i+m-1]-arr[i]);
		System.out.println(res);

	}

}
