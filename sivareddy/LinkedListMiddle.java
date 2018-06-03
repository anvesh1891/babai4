package Sample;

public class LinkedListMiddle {
	static Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void printMiddle()
	{
		Node slow=head;
		Node fast=head;
		if(head!=null)
		{
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			System.out.println(slow.data);
		}
	}
	public void printList()
	{
		Node tnode=head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
	}
	public static void main(String[] args)
	{
		LinkedListMiddle lst=new LinkedListMiddle();
		lst.push(23);
		lst.push(49);
		lst.push(90);
		lst.push(34);
		lst.push(1);
		lst.printMiddle();
		lst.printList();
	}

}
