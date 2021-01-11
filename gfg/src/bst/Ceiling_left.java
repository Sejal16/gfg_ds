package bst;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Ceiling_left {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
TreeSet<Integer> ts=new TreeSet<>();
ts.add(arr[0]);
for(int i=1;i<n;i++)
{

	if(ts.contains(ts.ceiling(arr[i]))) 
		System.out.println(ts.ceiling(arr[i]));
	else
		System.out.println(-1);
	ts.add(arr[i]);
}
		}
	}

}
