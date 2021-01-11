package array;

import java.util.Scanner;

public class Min_consecutive_flips {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}int num;
			if(arr[0]==1)
				num=0;
			else
				num=1;
			int c=0,end=0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==num && c==0)
				{
					int start=i;
					if(end>0) {
					System.out.print(i +"to"+(start+end));
					end=0;
					}}
				else if(arr[i]==num)
				{
					c++;
				}
				else
				{
					end=c;
					c=0;
					
				}
			}
	}
	}
}
