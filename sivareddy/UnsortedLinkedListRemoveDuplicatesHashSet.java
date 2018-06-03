package Sample1;

import java.util.HashSet;

public class UnsortedLinkedListRemoveDuplicatesHashSet {
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
		HashSet<Integer> hs=new HashSet<Integer>();
		Node current=head,prev=null;
		while(current!=null)
		{
			int curval=current.data;
			if(hs.contains(curval))
			{
				prev.next=current.next;
			}
			else
			{
				prev=current;
				hs.add(current.data);
			}
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
		UnsortedLinkedListRemoveDuplicatesHashSet lst=new UnsortedLinkedListRemoveDuplicatesHashSet();
		lst.push(23);
		lst.push(29);
		lst.push(23);
		lst.push(190);
		lst.push(190);
		lst.removeDuplicates();
		lst.printList();
	}

}
