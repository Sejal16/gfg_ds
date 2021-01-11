package sorting;

import java.util.Scanner;

public class Cycle_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int writes=0;
		for(int cs=0;cs<n-1;cs++)
		{int pos=cs;
			int item=arr[cs];
			for(int i=cs+1;i<n;i++)
			{
				if(arr[i]<item)
					pos++;
			}
			if(pos==cs)
				continue;
			while(arr[pos]==item)
				pos++;
			//swap(arr,pos,item);
			if(item!=arr[pos])
			{
			int temp=arr[pos];
			arr[pos]=item;
			item=temp;
			writes++;
			}
			while(pos!=cs)
			{
				pos=cs;
				for(int i=cs+1;i<n;i++)
				{
					if(arr[i]<item)
						pos++;
				}	
				while(arr[pos]==item)
					pos++;
				//swap(arr,pos,item);
				if(item!=arr[pos])
				{
				int temp=arr[pos];
				arr[pos]=item;
				item=temp;
				writes++;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		System.out.println("number of comparison: "+writes);

	}
// static void swap(int arr[],int i, int item) {
//		int temp=arr[i];
//		arr[i]=item;
//		item=temp;
//		
//	}

}
