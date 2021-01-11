package linkedlist;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data=x;
		next=null;
		prev=null;
	}
}

public class Circular_double_ll {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int ch=1;
		do {
			System.out.println("\n1.Insert at beginning");
			System.out.println("2.Insert at end");
			System.out.println("3.Delete first Node");
			System.out.println("4.Delete last node");
			System.out.println("5.Print the elements of the list");
			System.out.println("6.Exit");
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
			print_list(head);
			break;
		case 6:
			break;
		default:System.out.println("Invalid choice");
		}
	}while(ch!=6);
	}
	
	
	// INSERTING ELEMENT AT THE BEGINNING 
	static Node Insert_beg(Node head,int x)
	{
		Node temp=new Node(x);
	
		if(head==null)
		{
			head=temp;
			head.next=head;
			head.prev=head;
		
		}
		else {
		temp.prev=head.prev;	
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		head=temp;
		}
	return head;	
	}
	
	// INSERTING ELEMENTS AT THE END
	static Node Insert_end(Node head,int x)
	{
		Node temp=new Node(x);
		
		if(head==null)
		{
			head=temp;
			head.next=head;
			head.prev=head;
		}
		else {
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		}
		
		return head;
	}
	
	// DELETING ELEMENTS AT THE BEGINNING
	static Node Delete_beg(Node head) {
		if(head==null)
			System.out.println("List is empty");
		if(head.next==head)
		{		head=null;
		System.out.println("Node dleted");
	}
		else {
			head.next.prev=head.prev;
			head.prev.next=head.next;
			head=head.next;
			System.out.println("Node deleted");
			
		}
		return head;
	}
	
	// DELETING ELEMENTS AT THE END
	static Node Delete_end(Node head) {
		if(head==null)
			System.out.println("List is empty");
		else if(head.next==head)
			{
			head=null;
			System.out.println("Node deleted");
			}
		else {
			head.prev.prev.next=head;
			head.prev=head.prev.prev;
			
			System.out.println("Node deleted");
		}
		return head;
	}
	

	
	// PRINTING ELEMENTS
	static void print_list(Node head)
	{
//		Node ptr=head;
//		if(ptr==null)
//		{	System.out.println("List is empty");
//		return;
//		}
//		while(ptr.next!=head)
//		{
//			System.out.println(ptr.data);
//			ptr=ptr.next;
//		}
//		System.out.println(ptr.data);
	Node ptr=head;
	if(ptr==null)
		{
		System.out.println("List is empty");
		return;
		}
	do
	{
		System.out.println(ptr.data);
		ptr=ptr.next;
	}while(ptr!=head);
	}
}
