package Sample1;

public class LinkedListUnionAndIntersection {
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
	public void getIntersection(Node head1,Node head2)
	{
		Node t1=head1,t2=head2;
		while(t1!=null)
		{
			push(t1.data);
			t1=t1.next;
		}
		while(t2!=null)
		{
			if(!isPresent(head,t2.data))
				push(t2.data);
			t2=t2.next;
		}
	}
	public void getUnion(Node head1,Node head2)
	{
		Node t1=head1;
		while(t1!=null)
		{
			if(isPresent(head2,t1.data))
				push(t1.data);
			t1=t1.next;
		}
		
	}
	boolean isPresent(Node head,int data)
	{
		Node t=head;
		while(t!=null)
		{
			if(t.data==data)
				return true;
			t=t.next;
		}
		return false;
	}
	public void printList()
	{
		Node tNode=head;
		while(tNode!=null)
		{
			System.out.print(tNode.data+" ");
			tNode=tNode.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		LinkedListUnionAndIntersection lst1=new LinkedListUnionAndIntersection();
		LinkedListUnionAndIntersection lst2=new LinkedListUnionAndIntersection();
		LinkedListUnionAndIntersection intersection=new LinkedListUnionAndIntersection();
		LinkedListUnionAndIntersection union=new LinkedListUnionAndIntersection();
		lst1.push(21);
		lst1.push(98);
		lst1.push(76);
		lst1.push(25);
		lst2.push(98);
		lst2.push(25);
		lst2.push(1);
		intersection.getIntersection(lst1.head,lst2.head);
		union.getUnion(lst1.head,lst2.head);
		intersection.printList();
		union.printList();
	}

}
