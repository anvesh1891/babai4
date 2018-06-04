package Sample1;

public class LinkedListNthNodeLast {
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
	public void findNthElementFromLast(int n)
	{
		Node temp=head;
		int len=0;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		if(len<n)
			return;
		temp=head;
		for(int i=1;i<len-n+1;i++)
			temp=temp.next;
		System.out.println(temp.data);
		
	}
	public void findNthElementFromLast1(int n)
	{
		Node main_ptr=head;
		Node ref_ptr=head;
		int count=0;
		while(count<n)
		{
			if(ref_ptr==null)
				System.out.println(n+"is greater than no of "+"nodes in list");
			ref_ptr=ref_ptr.next;
			count++;
		}
		while(ref_ptr!=null)
		{
			ref_ptr=ref_ptr.next;
			main_ptr=main_ptr.next;
		}
		System.out.println(main_ptr.data);
	}
	public static void main(String[] args)
	{
		LinkedListNthNodeLast lst=new LinkedListNthNodeLast();
		lst.push(20);
		lst.push(100);
		lst.push(1);
		lst.push(79);
		lst.findNthElementFromLast(3);
		lst.findNthElementFromLast1(2);
	}

}
