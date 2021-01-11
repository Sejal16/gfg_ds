package array;

import java.util.Scanner;

public class BONACCI_SERIES {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t-- > 0) {
		int m=sc.nextInt();
		int n = sc.nextInt();
		int arr[]=new int[n];
	
		int k=0;
		for(int i=0;i<m-1;i++)
			arr[i]=0;
		arr[m-1]=1;
		int sum=1;
		for(int i=m;i<n;i++) {
			arr[i]=sum;
		sum=sum+arr[i]-arr[k];
		k++;
	}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	}

}
