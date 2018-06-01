package Sample;
//Linked list implementation. Insertion of elements at start, after and end of list.
//TC:O(1)
public class LinkedList {
	Node head;
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
		Node new_node =new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null)
			last=last.next;
		last.next=new_node;
		return;
	}
	public void printList()
	{
		Node tNode=head;
		while(tNode!=null)
		{
			System.out.println(""+tNode.data);
			tNode=tNode.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList llist=new LinkedList();
		//append at last
		llist.append(20);
		llist.append(20);
		//push at start
		llist.push(19);
		llist.push(23);
		//insert after 19
		llist.insertAfter(llist.head.next,34);
		llist.printList();
	}

}
