package bst;
import java.util.*;



import java.io.*;
import java.lang.*;
class nodeT{
	int data;
	nodeT left;
	nodeT right;
	nodeT(int data)
	{
		this.data=data;
	}
}
public class Basic_operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		nodeT root=null;
		int ch=1;
		while(ch!=-1)
		{
			System.out.println("1.Insert elements int the tree in recursive");
			System.out.println("2.Insert elements int the tree in ITERATIVE");
			System.out.println("3.Search element  in recursive way");
			System.out.println("4.Search element  in ITERATIVE way");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter the number");
				int k=sc.nextInt();
				root=insertR(root,k);
				break;
			case 2: 
				System.out.println("Enter the number");
				 k=sc.nextInt();
				root=insertI(root,k);
				break;
			case 3:
				System.out.println("Enter the number to searched");
				 k=sc.nextInt();
				boolean res=searchR(root,k);
				if(res==true)
					System.out.println(k+" element is present in the tree");
				else 
					System.out.println(k+" element is not present in the tree");
				break;
			case 4:
				System.out.println("Enter the number to searched");
				 k=sc.nextInt();
				boolean res1=searchI(root,k);
				if(res1==true)
					System.out.println(k+" element is present in the tree");
				else 
					System.out.println(k+" element is not present in the tree");
				break;
				
			}
		}
	}

	private static nodeT insertI(nodeT root, int k) {
	nodeT curr=root,parent=null;
	nodeT temp=new nodeT(k);
	while(curr!=null)
	{
		parent =curr;
		if(curr.data>k)
			curr=curr.left;
		else if(curr.data<k)
		curr=curr.right;
		else
		return root;
	}
	if(parent==null)
		return temp;
	if(parent.data>k)
		parent.left=temp;
	else
		parent.right=temp;
		return root;
	}

	private static nodeT insertR(nodeT root, int k) {
		  
		if (root==null)
			root=new nodeT(k);
		if(root.data>k)
			root.left= insertR(root.left,k);
		else if(root.data<k)
			root.right=insertR(root.right,k);
		return root;
	}

	private static boolean searchI(nodeT root, int k) {
		if(root==null)
		return false;
		if(root.data==k)
		return true;
	if(root.data>k)
		return searchR(root.left,k);
	else
		return searchR(root.right,k);
	}

	private static boolean searchR(nodeT root, int k) {
		while(root!=null)
		{
					if(root.data==k)
						return true;
					else if(root.data>k)
						root=root.left;
					else
						root=root.right;
				}
						return false;
				
	}



}
