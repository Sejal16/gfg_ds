package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Max_guest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int dep[]=new int[n];
			for (int i = 0; i < arr.length; i++) {
				dep[i]=sc.nextInt();
		}
	Arrays.parallelSort(arr);
	Arrays.parallelSort(dep);
	int i=1,j=0,c=1,res=1;
	while(i<n && j<n)
	{
		if(arr[i]<=dep[j])
		{
			i++;
			c++;
		}
		else
		{
			j++;
			c--;
		}
		res=Math.max(res,c);
	}
System.out.println(res);
	}

}
