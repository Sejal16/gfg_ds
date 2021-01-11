package queue;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Generate_numbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t-- > 0) {
		int n = sc.nextInt();
		Queue<String> q=new LinkedList<>();
		q.add("5");
		q.add("6");
		for(int i=1;i<=n;i++)
		{
			String curr=q.poll();
			System.out.println(curr);
			q.offer(curr+"5");
			q.offer(curr+"6");		
		}
	}

	}

}
