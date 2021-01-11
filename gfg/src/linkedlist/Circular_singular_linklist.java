package linkedlist;

import java.util.Scanner;

public class Circular_singular_linklist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		node head=null;
		int ch=1;
		do {
			System.out.println("1.Insert at beginning");
			System.out.println("2.Insert at end");
			System.out.println("3.Delete first Node");
			System.out.println("4.Delete last node");
			System.out.println("5.Delete node at aspecific position");
			System.out.println("6.Print the elements of the list");
			System.out.println("7.Exit");
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
			System.out.println("Enter a position: ");
			 x=sc.nextInt();
			head=Delete_pos( head, x);
			break;
		case 6:
			print_list(head);
			break;
		case 7:
			break;
		
		default:System.out.println("Invalid choice");
		}
	}while(ch!=7);
	}
	
	
	// INSERTING ELEMENT AT THE BEGINNING 
		static node Insert_beg(node head,int x)
		{
			node temp=new node(x);
		
			if(head==null)
			{
				head=temp;
				temp.next=head;
			
			}
			else {
			node ptr=head;
			while(ptr.next!=head)
				ptr=ptr.next;
			ptr.next=temp;;
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
				temp.next=head;
			}
			else {
			node ptr=head;
			while(ptr.next!=head)
			ptr=ptr.next;
			
			ptr.next=temp;
			temp.next=head;
			}
			
			return head;
		}
		// DELETING ELEMENTS AT THE BEGINNING
		static node Delete_beg(node head) {
			if(head==null) {
				System.out.println("List is empty");
				return head;
			}
			
			if(head.next==head)
				{
				head=null;
				System.out.println("Node deleted");
				}
			else {
				node ptr=head;
				while(ptr.next!=head)
					ptr=ptr.next;
				
				head=head.next;
				ptr.next=head;
				System.out.println("Node deleted");
				
			}
			return head;
		}
		
		// DELETING ELEMENTS AT THE END
		static node Delete_end(node head) {
			if(head==null)
				System.out.println("List is empty");
			else if(head.next==head)
				{
				head=null;
				System.out.println("Node deleted");
				}
			else {
				node ptr=head;
				while(ptr.next.next!=head)
				{
				
					ptr=ptr.next;
				}
				ptr.next=head;
				System.out.println("Node deleted");
			}
			return head;
		}
		static node Delete_pos(node head,int k) {
			if(head==null)
				System.out.println("List is empty");
			else if(k==1)
				{
				head=Delete_beg(head);
				
				}
			else {
				node ptr=head;
				for(int i=1;i<k-1;i++)
				{
				
					ptr=ptr.next;
				}
				ptr.next=ptr.next.next;
				System.out.println("Node deleted");
			}
			return head;
		}
		
		
		// PRINTING ELEMENTS
		static void print_list(node head)
		{
		node ptr=head;
		if(ptr==null)
		{	System.out.println("List is empty");
		return;
		}
		while(ptr.next!=head)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
		}
	}

	

