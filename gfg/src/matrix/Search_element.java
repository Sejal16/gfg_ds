package matrix;

import java.util.Scanner;

public class Search_element {

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
		int x=sc.nextInt();
	int i=0,j=c-1;
	while(i<r && j>=0)
	{
		if(arr[i][j]==x)
		{
			System.out.println("Found");
			return;
		}
		if(arr[i][j]>x)
			j--;
		else
			i++;
	}

	}

}
