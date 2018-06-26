package Sample1;

public class UnsortedLinkedListRemoveDuplicates {
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
	public void removeDuplicates()
	{
		Node ptr1=null,ptr2=null;
		Node dup=null;
		ptr1=head;
		while(ptr1!=null && ptr1.next!=null)
		{
			ptr2=ptr1;
			while(ptr2.next!=null)
			{
				if(ptr1.data==ptr2.next.data)
				{
					dup=ptr2.next;
					ptr2.next=ptr2.next.next;
					System.gc();
				}
				else
					ptr2=ptr2.next;
			}
			ptr1=ptr1.next;
		}
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
		
		UnsortedLinkedListRemoveDuplicates lst=new UnsortedLinkedListRemoveDuplicates();
		lst.push(23);
		lst.push(19);
		lst.push(23);
		lst.push(2);
		lst.push(2);
		lst.removeDuplicates();
		lst.printList();
	}

}
