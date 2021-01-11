package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Greater_element_to_left {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t-- > 0) {
				int n = sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				Deque<Integer> stack=new ArrayDeque<>();
				stack.push(arr[0]);
				System.out.println(-1);
				for(int i=1;i<n;i++)
				{
					while(stack.isEmpty()==false && stack.peek()<=arr[i])
					{
						stack.pop();
					}
					int res=stack.isEmpty()?-1:stack.peek();
						System.out.println(res);
						stack.push(arr[i]);	
				}
	}
	}
}
