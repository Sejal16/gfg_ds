package linkedlist;

import java.util.*;
import java.io.*;
import java.lang.*;
class node
{
	int data;
	node next;
	node(int x){
		data=x;
		next=null;
	}
}
public class Singular_Linklist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		node head=null;
		int ch=1;
		do {
			System.out.println("\n1.Insert at beginning");
			System.out.println("2.Insert at end");
			System.out.println("3.Delete first Node");
			System.out.println("4.Delete last node");
			System.out.println("5.Search in linklist Iterative way");
			System.out.println("6.Search in linklist recursive way");
			System.out.println("7.Print the elements of the list");
			System.out.println("8.Find middle number naive");
			System.out.println("9.Find middle number efficient");
			System.out.println("10.Reverse linekd list naive way");
			System.out.println("11.Reverse linked list efficient way");
			System.out.println("12.recursive Reverse linked list method 1");
			System.out.println("13.recursive Reverse linked list method 2");
			System.out.println("14.Reverse linked list by group kth recursive way");
			System.out.println("15.Reverse linked list by group kth iterative  way");
			System.out.println("16.Exit");
			System.out.println("Please Enter your choice: ");
	int x;
			
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a number: ");
			 x=sc.nextInt();
			head=Insert_beg(head,x);
			break;
		case 2:
			System.out.println("Enter a number: ");
			 x=sc.nextInt();
			head=Insert_end(head,x);
			break;
		case 3:
			head=Delete_beg(head);
			break;
		case 4:
			head=Delete_end(head);
			break;
		case 5:
			System.out.println("Enter a number to be searched: ");
			x=sc.nextInt();
			if(search_iterative( head,x)==true)
				System.out.println("ELement found");
			else
				System.out.println("Element not found!!");
			break;
		case 6:
			System.out.println("Enter a number to be searched: ");
			x=sc.nextInt();
			int res=search_recursive( head,x);
			if(res==-1)
				System.out.println("ELement not found!!");
			else
				System.out.println("Element  found at "+res);
			break;
		case 7:
			print_list(head);
			break;
		case 8:
			middle_element_naive(head);
			break;
		case 9:
			middle_element_efficient(head);
			break;
		case 10:
			head=reverse_naive( head);
			break;
		case 11:
			head=reverse_efficient(head);
			break;
		case 12:
			head=revRecurr_M1( head);
			break;
		case 13:
			head=revRecurr_M2( head,null);
			break;
		case 14:
			System.out.println("Enter the value k ");
			x=sc.nextInt();
			head=reverse_Kth_recurr( head,x);
			break;
		case 15:
			System.out.println("Enter the value k ");
			x=sc.nextInt();
			head=reverse_Kth_Iterative( head,x);
			break;
		case 16:
			break;
		default:System.out.println("Invalid choice");
		}
	}while(ch!=16);
	}
	
	
	// INSERTING ELEMENT AT THE BEGINNING 
	static node Insert_beg(node head,int x)
	{
		node temp=new node(x);
	
		if(head==null)
		{
			head=temp;
		
		}
		else {
		
		temp.next=head;
		head=temp;
		}
	return head;	
	}
	
	// INSERTING ELEMENTS AT THE END
	static node Insert_end(node head,int x)
	{
		node temp=new node(x);
		
		if(head==null)
		{
			head=temp;
		}
		else {
		node ptr=head;
		while(ptr.next!=null)
		ptr=ptr.next;
		
		ptr.next=temp;
		}
		
		return head;
	}
	
	// DELETING ELEMENTS AT THE BEGINNING
	static node Delete_beg(node head) {
		if(head==null)
			System.out.println("List is empty");
		else {
			
			head=head.next;
			System.out.println("Node deleted");
			
		}
		return head;
	}
	
	// DELETING ELEMENTS AT THE END
	static node Delete_end(node head) {
		if(head==null)
			System.out.println("List is empty");
		else if(head.next==null)
			{
			head=null;
			System.out.println("Node deleted");
			}
		else {
			node ptr=head;
			while(ptr.next.next!=null)
			{
			
				ptr=ptr.next;
			}
			ptr.next=null;
			System.out.println("Node deleted");
		}
		return head;
	}
	
	// SEARCHING ELEMENT ITERATIVE WAY
	
	static boolean search_iterative(node head,int x)
	{
		node ptr=head;
		while(ptr!=null)
		{
			if(ptr.data==x)
				return true;
			ptr=ptr.next;
		}
		return false;
	}
	
	// SEARCHING ELEMENT recursive WAY
	static int search_recursive(node head,int x)
	{
		if(head==null)
			return -1;
		if(head.data==x)
			return 1;
		else
		{
			int res=search_recursive(head.next,x);
			if(res==-1)
				return -1;
			else return res+1;
					
		}
	
	}
	
	// PRINTING ELEMENTS
	static void print_list(node head)
	{
	node ptr=head;
	if(ptr==null)
		System.out.println("List is empty");
	while(ptr!=null)
	{
		System.out.println(ptr.data);
		ptr=ptr.next;
	}
	}


// FIND MIDDLE ELEMENT NAIVE APPROACH TC:O(N)
 static void middle_element_naive(node head)
{
	 if(head==null)
		 return;
	 int c=0;
	node ptr=head;
	while(ptr!=null)
	{		c++;
	ptr=ptr.next;
}
	node ptt=head;
	for(int i=1;i<=c/2;i++)
	{
		ptt=ptt.next;
	}
	System.out.println(ptt.data);
}
//FIND MIDDLE ELEMENT efficient APPROACH TC:O
  static void middle_element_efficient(node head)
{
	  if(head==null)return;
      node slow=head,fast=head;
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      System.out.print(slow.data);
}
  static node reverse_naive(node head)
  {
	 List<Integer> list=new ArrayList<>();
	 node ptr=head;
	 while(ptr!=null)
	 {
		 list.add(ptr.data);
		 ptr=ptr.next;
	 }
	 ptr=head;
	 while(ptr!=null)
	 {
		 ptr.data=list.remove(list.size()-1);
		 ptr=ptr.next;
	 }
	  
	 return head; 
  }
  static node reverse_efficient(node head)
  {
	  if(head==null || head.next==null)
		  return head;
	  node curr=head;
	  node prev=null;
	  while(curr!=null)
	  {
	
		  node nextt=curr.next;
		  curr.next=prev;
		  prev=curr;
		  curr=nextt;
	  }
	head=prev;
	 return head; 
  }
  static node revRecurr_M1(node head)
  {
	  if(head==null || head.next==null)
		  return head;
	  node rest_head=revRecurr_M1(head.next);
	  node q=head.next;
	  q.next=head;
	  head.next=null;
	  return rest_head;
  }
  
  static node revRecurr_M2(node curr, node prev)
  {
	  if(curr==null )
		  return prev;
	  node nextt=curr.next;
	  curr.next=prev;  
	  return revRecurr_M2(nextt,curr);
  }
  //REVERSE KTH NODE IN RECURSIVE WAY
static node reverse_Kth_recurr(node head,int k)
{
	node curr=head;
	node nextt=null,prev=null;
	int c=0;
	
	while(curr!=null && c<k)
	{
	nextt=curr.next;
	curr.next=prev;
	prev=curr;
	curr=nextt;
	c++;
	}
	if(nextt!=null)
	{
		node res_head=reverse_Kth_recurr(nextt,k);
		head.next=res_head;;
	}
	return prev;
}
 	//REVERSE KTH NODE IN ITERATIVE WAY
static node reverse_Kth_Iterative(node head,int k)
{
	node curr=head, prevFirst=null;

	boolean isFirst=true;
	while(curr!=null)
	{	int c=0;
		node prev=null,first =curr;
		while(curr!=null && c<k)
		{
		node nextt=curr.next;
		curr.next=prev;
		prev=curr;
		curr=nextt;
		c++;
		}
		if(isFirst)
		{
			head=prev;
			isFirst=false;
		}
		else {
			prevFirst.next=prev;
		}
		prevFirst=first;
	}
	return head;
}
}