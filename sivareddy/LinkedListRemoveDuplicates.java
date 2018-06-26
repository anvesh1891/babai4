package Sample1;
//remove duplicates from sorted list
//TC:O(n)
public class LinkedListRemoveDuplicates {
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
		Node new_Node=new Node(new_data);
		new_Node.next=head;
		head=new_Node;
	}
	public void removeDuplicates()
	{
		if(head==null)
			return;
		Node current=head;
		Node next_next;
		while(current.next!=null)
		{
			if(current.data==current.next.data)
			{
				next_next=current.next.next;
				current.next=null;
				current.next=next_next;
			}
			else
			current=current.next;
		}
	}
	public void printList()
	{
		Node tNode=head;
		while(tNode!=null)
		{
			System.out.println(tNode.data+" ");
			tNode=tNode.next;
		}
		
	}
	public static void main(String[] args)
	{
		LinkedListRemoveDuplicates lst=new LinkedListRemoveDuplicates();
		lst.push(33);
		lst.push(29);
		lst.push(29);
		lst.push(10);
		lst.push(10);
		lst.removeDuplicates();
		lst.printList();
	}

}
