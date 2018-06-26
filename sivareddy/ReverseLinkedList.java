package Sample1;

public class ReverseLinkedList {
	Node head;
	class Node{
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
		Node new_Node=new Node(new_data);
		new_Node.next=head;
		head=new_Node;
	}
	public void reverseLinkedList()
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		Node node;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		printList(node);
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
		ReverseLinkedList lst=new ReverseLinkedList();
		lst.push(23);
		lst.push(90);
		lst.push(80);
		lst.push(76);
		lst.reverseLinkedList();
	}

}
