package heap;
import java.util.*;
import java.io.*;
import java.lang.*;

class pair
{
	Integer diff;
	Integer value;
pair(Integer x,Integer y)
{
	diff=x;
	value=y;
}
public Integer getDiff() {
	return diff;
}
public void setDiff(int diff) {
	this.diff = diff;
}
public Integer getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}

}
public class Kclosest_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int x=sc.nextInt();
int k=sc.nextInt();

Comparator <pair> com=new Comparator<pair>() {
	public int compare(pair p1,pair p2)
	{
		return p2.getDiff().compareTo(p1.getDiff());
	}
};
PriorityQueue<pair> pq=new PriorityQueue<>(com);
	for(int i=0;i<k;i++)
		pq.add(new pair(Math.abs(arr[i]-x),arr[i]));
	for(int i=k;i<n;i++)
	{ int diff=Math.abs(arr[i]-x);
		if(pq.peek().getDiff()>diff) {
			pq.remove();
		pq.add(new pair(diff,arr[i]));
	}}
	while(pq.isEmpty()==false)
		System.out.println(pq.poll().getValue());

	}

}
