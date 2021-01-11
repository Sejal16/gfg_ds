package sorting;

import java.util.Scanner;

public class Count_Inversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int result=sort(arr,n,0,n-1);
		System.out.println(result);
	}
	static int sort(int[] arr, int n, int l, int r) {
		int res=0;
		if(r>l)
		{
			int mid= l+(r-l)/2;
			res+=sort(arr,n,l,mid);
			res+=sort(arr,n,mid+1,r);
			res+=merge(arr,l,mid,r);
		}
		return res;
	 }

 static int merge(int[] arr, int l, int mid, int r) {
	int res=0;
	 int n1=mid+1-l;
	int n2=r-mid;
	int a[]=new int[n1];
	int b[]=new int[n2];
	for(int i=0;i<n1;i++)
		a[i]=arr[l+i];
	for(int j=0;j<n2;j++)
		b[j]=arr[mid+1+j];
	int i=0,j=0,k=l;
	while(i<n1 && j<n2)
	{
		if(a[i]<=b[j])
			arr[k++]=a[i++];
		else {
			arr[k++]=b[j++];
			res++;
	}}
	while(i<n1)
	{
		arr[k++]=a[i++];
		res++;
	}
	while(j<n2)
	{
		arr[k++]=b[j++];
	}
	
		return res;
	}
	

}
