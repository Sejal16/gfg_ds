package queue;

import java.util.*;
import java.io.*;
import java.lang.*;
public class Reverse_Iterative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Queue<Integer> q= new LinkedList<>();
			Stack<Integer> s=new Stack<>();
		
			for (int i = 0; i < n; i++) 
				{
					int x=sc.nextInt();
					q.add(x);
				}
		while(q.isEmpty()==false)
		{
			s.add(q.poll());
		}
		while(s.isEmpty()==false)
			q.add(s.pop());
		System.out.println(q);
			}
		}
	}


