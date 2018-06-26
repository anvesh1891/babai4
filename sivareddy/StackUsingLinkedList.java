package Practise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackUsingLinkedList {
	static Node top=null;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public void push(int x)
	{
		if(isEmpty()==true)
		{
			Node new_Node=new Node(x);
			top=new_Node;
		}
		else
		{
			Node new_Node=new Node(x);
			new_Node.next=top;
			top=new_Node;
		}
	}
	public int pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			int x=top.data;
			top=top.next;
			return x;
		}
		
	}
	public int peek()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return top.data;
		}
		
	}
	public void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			Node tNode=top;
			while(tNode!=null)
			{
				System.out.println(tNode.data+" ");
				tNode=tNode.next;
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		StackUsingLinkedList sll=new StackUsingLinkedList();
		int temp,ch;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("1.Insert an element in the stack");
			System.out.println("2.Remove element from the stack");
			System.out.println("3.Peek element in the stack");
			System.out.println("4.Display elements in the stack");
			System.out.println("5.exit");
			ch=Integer.parseInt(obj.readLine());
			switch(ch)
			{
			  case 1:
				  System.out.println("Element to be inserted is:");
				  temp=Integer.parseInt(obj.readLine());
				  sll.push(temp);
				  break;
			  case 2:
				  System.out.println("Element to be removed is:");
				  sll.pop();
				  break;
			  case 3:
				  System.out.println("Element peek is:");
				  temp=Integer.parseInt(obj.readLine());
				  sll.peek();
				  break;
			  case 4:
				  System.out.println("Elements in stack are:");
				  sll.display();
				  break;
			}
		}while(ch!=4);
	}

}
