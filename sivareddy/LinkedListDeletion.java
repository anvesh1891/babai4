package Sample;
//TC:O(1)
public class LinkedListDeletion {
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
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void delete(int key)
	{
		Node temp=head,prev=null;
		while(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)return;
		prev.next=temp.next;
	}
	public void deletePosition(int position)
	{
		if(head==null)
			return;
		Node temp=head;
		if(position==0)
		{
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null&&i<position-1;i++)
			temp=temp.next;
		if(temp==null||temp.next==null)
			return;
		Node next=temp.next.next;
		temp.next=next;	
		
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
		LinkedListDeletion llist=new LinkedListDeletion();
		llist.push(23);
		llist.push(19);
		llist.push(100);
		llist.push(99);
		llist.delete(100);
		llist.deletePosition(1);
		llist.printList();
	}

}
