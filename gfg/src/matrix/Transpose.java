package matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			arr[i][j]=sc.nextInt();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=i+1;j<c;j++)
			swap(arr,i,j);
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			System.out.print(arr[i][j]+" ");
			
		System.out.println();

	}}
	private static void swap(int arr[][],int i, int j) {
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		
	}
		

}
