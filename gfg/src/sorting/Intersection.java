package sorting;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a[]=new int[n1];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int n2 = sc.nextInt();
		int b[]=new int[n2];
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
	
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(i>0 && a[i]==a[i-1])
			{i++;
				continue;}
			if(a[i]<b[j])
			i++;
			else if(a[i]>b[j])
				j++;		
		else
		{
			System.out.println(a[i]);
			i++;j++;
		}
		
		
	}}}


