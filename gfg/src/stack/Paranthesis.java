package stack;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Paranthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		ArrayDeque<Character> s=new ArrayDeque<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
				s.push(str.charAt(i));
			else
			{
				if(s.isEmpty()==true) {
					System.out.println("not balanced");
					return;}
				else 
				{
					if(match(s.peek(),str.charAt(i))==false)
					{

						System.out.println("not balanced");
						return;
					}
					else
						s.pop();
						
				}
			}
		}
		if(s.isEmpty()==true)
			System.out.println(" balanced");
		else
		{System.out.println("not balanced");
		return;}
			
	}

	private static boolean match(Character a, char b) {
	     return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
	    
	}

}
