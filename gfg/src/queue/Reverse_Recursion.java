package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Queue<Integer> q= new LinkedList<>();
		    for (int i = 0; i < n; i++) 
				{
					int x=sc.nextInt();
					q.add(x);
				}
		reverse(q);
		System.out.println(q);
	}

}

	public  static void reverse(Queue<Integer> q) {
		 
		if(q.isEmpty())
			return;
		int x=q.poll();
		reverse(q);
		q.add(x);
		
		
	}
	
}
