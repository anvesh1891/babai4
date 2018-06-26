package Sample;

public class LinkedListMiddlePart2 {
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
	public void findMiddle()
	{
		int count=0;
		Node slow=head;
		Node mid=head;
		while(slow!=null)
		{	
			if(count%2!=0)
				mid=mid.next;
			++count;
			slow=slow.next;
		}
		System.out.println(mid.data);
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
		LinkedListMiddlePart2  lst=new LinkedListMiddlePart2();
		lst.push(23);
		lst.push(34);
		lst.push(20);
		lst.push(90);
		lst.push(108);
		lst.findMiddle();
		lst.printList();
	}

}
