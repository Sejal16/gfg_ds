package array;

import java.util.Scanner;

public class Max_difference {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
int max=arr[1]-arr[0],minVal=arr[0];
for (int i = 1; i < arr.length; i++) {
	max=Math.max(max, arr[i]-minVal);
	minVal=Math.min(minVal, arr[i]);
}
System.out.println(max);
	}

}
