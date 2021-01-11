package mathematics;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Sieve_eratosthenes {

	static int arr[]=new int[1000000];
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t-- > 0) {
		int n = sc.nextInt();
		boolean prime[]=new boolean[n];
		Arrays.fill(prime, true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i]==true)
			{
				for(int j=i*i;j<n;j+=i)
					prime[j]=false;
			}
		}
		int k=0;
		for (int i = 0; i < prime.length; i++) {
			if(prime[i]==true)
			{
				//System.out.println(i);
				arr[k++]=i;
			}}
		print();
	}
	

	}
static void print()
{int k=0;
	System.out.println(arr[k]);
	k++;
	System.out.println(arr[k]);
	k++;
	System.out.println(arr[k]);
	k++;
	System.out.println(arr[k]);
	k++;
}
}
