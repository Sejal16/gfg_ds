package array;

import java.util.Scanner;

public class Trapping_rain_water {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
int arr[]=new int[n];

for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
 getwater(arr,n);
 efficient(arr,n);
	}

//NAIVE APPROACH O(n^2)
	// FIND THE MAX OF THE LEFTMOST
	//FIND THE MAX OF THE RIGHT MOST
	// FIND MIN OF LMAX AND RMAX
	// SUBTRACT MIN WITH THAT NUMBER
	public static void getwater(int[] arr, int n) {
		int res=0;
		for(int i=1;i<n-1;i++)
		{
			int lmax=arr[i];
			for(int j=0;j<i;j++)
				 lmax=Math.max(lmax, arr[j]);
			int rmax=arr[i];
			for(int j=i+1;j<n;j++)
				rmax=Math.max(rmax, arr[j]);
			res=res+Math.min(lmax, rmax)-arr[i];
		}
System.out.println(res);
	}
	//efficient sc:O(n)
	
	private static void efficient(int[] arr, int n) {
		
	    	int res = 0;
	 
	    	int lMax[] = new int[n];
	    	int rMax[] = new int[n];
	 
	    	lMax[0] = arr[0];
	    	for(int i = 1; i < n; i++)
	    		lMax[i] = Math.max(arr[i], lMax[i - 1]);
	 
	 
	    	rMax[n - 1] = arr[n - 1];
	    	for(int i = n - 2; i >= 0; i--)
	    		rMax[i] = Math.max(arr[i], rMax[i + 1]);
	 
	    	for(int i = 1; i < n - 1; i++)
	    		res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
	    	System.out.println(res);
	   
}
	

		
	}
	


