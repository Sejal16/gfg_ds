package array;

import java.util.Scanner;

public class Buy_sell_stock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
int arr[]=new int[n];
int profit=0;
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
for (int i = 1; i < arr.length; i++) {
	if(arr[i]>arr[i-1])
		profit+=(arr[i]-arr[i-1]);
}
System.out.println(profit);
	}

}
