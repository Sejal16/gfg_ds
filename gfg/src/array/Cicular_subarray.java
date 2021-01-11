package array;

import java.util.Scanner;

public class Cicular_subarray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t-- > 0) {
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(overallMaxSum(arr, n));
	}
	}
	static int normalMaxSum(int arr[], int n)    ///  USING KADANE’S ALGORITHM
    {
    	int res = arr[0];
    	int maxEnding = arr[0];
    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);
    		res = Math.max(maxEnding, res);
    	}
    	return res;
    }
 
    static int overallMaxSum(int arr[], int n)
    {
    	int max_normal = normalMaxSum(arr, n);
    	if(max_normal < 0)
    		return max_normal;
    	int arr_sum = 0;
    	for(int i = 0; i < n; i++)
    	{
    		arr_sum += arr[i];
 
    		arr[i] = -arr[i]; // we are inverting the values so that we don't have to write the kadanses algorithm again with min sum of subarray
    	}
    	int max_circular = arr_sum + normalMaxSum(arr, n);
    	return Math.max(max_circular, max_normal);
    }
 

}
