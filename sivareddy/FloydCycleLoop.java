package Sample;

import Sample.LinkedListLoop.Node;

public class FloydCycleLoop {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void detectAndRemoveLoop(Node node)
	{
	    if (node == null || node.next == null)
            return;
		Node slow=node,fast=node;
		slow=slow.next;
		fast=fast.next.next;
		while(fast!=null && fast.next!=null)
		{
		if (slow == fast) 
                break;
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==fast) 
		{
			slow=node;
			while(slow.next!=fast.next)
			{
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
			
		}
		
	}
	
	public void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}
	public static void main(String[] args)
	{
		FloydCycleLoop lst=new FloydCycleLoop();
		lst.head=new Node(50);
		lst.head.next=new Node(90);
		lst.head.next.next=new Node(1);
		lst.head.next.next.next=new Node(23);
		lst.head.next.next.next.next=new Node(100);
		//creating loop in linked list
		head.next.next.next.next.next=head.next.next;
		lst.detectAndRemoveLoop(head);
		lst.printList(head);
	}

}
