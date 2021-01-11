package array;

import java.util.Scanner;

public class Majority_element {

	public static void main(String[] args) {
	// BOYER MOYERS ALGORITHM
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		int c=1,res=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[res]==arr[i])
			{
				c++;
			}
			else
			{
				c--;
			
			}
			if(c==0)
			{
				c=1;
				res=i;
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[res]==arr[i])
				count++;
		}
		if(count <=n/2)
			System.out.println(-1);
		else
		System.out.println(arr[res]);
		
	}}

}
