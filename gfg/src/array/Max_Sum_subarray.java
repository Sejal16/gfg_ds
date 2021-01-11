package array;

import java.util.Scanner;

public class Max_Sum_subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) 
			arr[i]=sc.nextInt();
		int  max=arr[0],res=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=Math.max(arr[i],arr[i]+max);
			res=Math.max(res,max);
			
		}
		System.out.println(res);
		}

}





//int c=0;
//int max=arr[0],pos=0;
//for(int i=0;i<n;i++) {
//	if(arr[i]<0)
//		c++;
//	if(max<arr[i]) {
//		max=arr[i];
//		pos=i;
//	}}
//if(c==0)
//{int s=0;
//	for (int i = 0; i < arr.length; i++) {
//		s+=arr[i];
//	}
//	System.out.println(s);
//}
//else if(c==n)
//{
//	System.out.println(max);
//}
//else {
//int s1=0,sum1=arr[pos],s2=0,sum2=arr[pos];
//for(int i=pos;i>=0;i--)
//	{
//	s1+=arr[i];
//	sum1=Math.max(sum1, s1);
//	
//	}
//for(int i=pos;i<n;i++) {
//	s2+=arr[i];
//	sum1=Math.max(sum1, s2);
//}
//
//System.out.println(Math.max(sum1, sum2));
//}