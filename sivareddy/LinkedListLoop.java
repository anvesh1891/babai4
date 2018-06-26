package Sample;

public class LinkedListLoop {
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
	
	public int detectAndRemoveLoop(Node node)
	{
		Node slow=node,fast=node;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				removeLoop(slow,node);
				return 1;
			}
		}
		return 0;
	}
	public void removeLoop(Node loop,Node head)
	{
		Node ptr1=loop;
		Node ptr2=loop;
		int i,k=1;
		while(ptr1.next!=ptr2)
		{
			ptr1=ptr1.next;
			k++;
		}
		ptr1=head;
		ptr2=head;
		for(i=0;i<k;i++)
			ptr2=ptr2.next;
		while(ptr1!=ptr2)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		ptr2=ptr2.next;
		while(ptr2.next!=ptr1)
			ptr2=ptr2.next;
		ptr2.next=null;
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
		LinkedListLoop lst=new LinkedListLoop();
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
