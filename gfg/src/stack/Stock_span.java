package stack;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Stock_span {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			Deque<Integer> stack=new ArrayDeque<>();
			stack.push(0);
			System.out.println(1);
			for(int i=1;i<n;i++)
			{
				while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i])
				{
					
					stack.pop();
					
				}
				int res=stack.isEmpty()?(i+1):(i-stack.peek());
					System.out.println(res);
					stack.push(i);
				
			}

		}

	}

}
