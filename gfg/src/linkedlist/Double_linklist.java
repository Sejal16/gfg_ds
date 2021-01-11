package linkedlist;
import java.util.*;
import java.io.*;
import java.lang.*;
import linkedlist.Circular_double_ll;
//class Node
//{
//	int data;
//	Node next;
//	Node prev;
//	Node(int x){
//		data=x;
//		next=null;
//		prev=null;
//	}
//}

public class Double_linklist {

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
		
		}
		else {
		head.prev=temp;
		temp.next=head;
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
		}
		else {
		Node ptr=head;
		while(ptr.next!=null)
		ptr=ptr.next;
		
		temp.prev=ptr;
		ptr.next=temp;
		}
		
		return head;
	}
	
	// DELETING ELEMENTS AT THE BEGINNING
	static Node Delete_beg(Node head) {
		if(head==null)
			System.out.println("List is empty");
		if(head.next==null)
		{		head=null;
		System.out.println("List is empty");
	}
		else {
			
			head=head.next;
			head.prev=null;
			System.out.println("Node deleted");
			
		}
		return head;
	}
	
	// DELETING ELEMENTS AT THE END
	static Node Delete_end(Node head) {
		if(head==null)
			System.out.println("List is empty");
		else if(head.next==null)
			{
			head=null;
			System.out.println("Node deleted");
			}
		else {
			Node ptr=head;
			while(ptr.next!=null)
			{
			
				ptr=ptr.next;
			}
			ptr.prev.next=null;
			System.out.println("Node deleted");
		}
		return head;
	}
	

	
	// PRINTING ELEMENTS
	static void print_list(Node head)
	{
	Node ptr=head;
	if(ptr==null)
		System.out.println("List is empty");
	while(ptr!=null)
	{
		System.out.println(ptr.data);
		ptr=ptr.next;
	}
	}
}
