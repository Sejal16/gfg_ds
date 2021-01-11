package array;

import java.util.Scanner;

public class Insert_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the limit number of elements: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the position at which you want to enter the new number: ");
		int pos=sc.nextInt();
		System.out.println("Enter the value: ");
		int val=sc.nextInt();
		n=insertion(arr,n,5,pos-1,val);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			
		}
	}
// TIME COMPLEXITY= O(n)
	
	public static int insertion(int[] arr, int n, int cap, int pos, int val) {
		if(n==cap)
			return n;
		for(int i=n-1;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		return n+1;
	}

	
}
