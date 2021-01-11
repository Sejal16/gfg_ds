package matrix;

import java.util.Scanner;

public class Spiral_print {

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
		int top=0,left=0,right=c-1,bottom=r-1;
		while(top<=bottom && left<=right)
		{
			for(int i=left;i<=right;i++)
				System.out.print(arr[top][i]+" ");
			top++;
			for(int i=top;i<=bottom;i++)
				System.out.print(arr[i][right]+" ");
			right--;
			if(top<=bottom) {
			for(int i=right;i>=left;i--)
				System.out.print(arr[bottom][i]+" ");
			bottom--;
			}
			if(left<=bottom) {
			for(int i=bottom;i>=top;i--)
				System.out.print(arr[i][left]+" ");
			left++;
			}
		}
	}

}
