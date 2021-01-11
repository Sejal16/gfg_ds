package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Next_greater_to_right {

	public static void main(String[] args) {
	
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t-- > 0) {
				int n = sc.nextInt();
				int arr[]=new int[n];
				int p[]=new int[n];
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				Deque<Integer> stack=new ArrayDeque<>();
				stack.push(arr[n-1]);
			p[n-1]=-1;
				for(int i=n-2;i>=0;i--)
				{
					while(stack.isEmpty()==false && stack.peek()<=arr[i])
					{
						stack.pop();
					}
					int res=stack.isEmpty()?-1:stack.peek();
						p[i]=res;
						stack.push(arr[i]);	
				}
				for(int i=0;i<n;i++)
					System.out.println(p[i]);
	}

	}

}
