package Sample1;

public class LinkedListLasttoFirst {
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
	public void moveLast()
	{
		Node Last=head;
		Node secLast=null;
		if(Last==null||Last.next==null)
			return;
		while(Last.next!=null)
		{
			secLast=Last;
			Last=Last.next;
		}
		secLast.next=null;
		Last.next=head;
		head=Last;
	}
	public void printList()
	{
		Node tNode=head;
		while(tNode!=null)
		{
			System.out.print(tNode.data+" ");
			tNode=tNode.next;
		}
	}
	public static void main(String[] args)
	{
		LinkedListLasttoFirst lst=new LinkedListLasttoFirst();
		lst.push(23);
		lst.push(94);
		lst.push(1);
		lst.push(100);
		lst.push(99);
		lst.moveLast();
		lst.printList();
	}

}
