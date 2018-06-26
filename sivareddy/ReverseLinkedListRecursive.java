package Sample1;

public class ReverseLinkedListRecursive {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public Node reverseLinkedList(Node curr,Node prev)
	{
	  
		if(curr.next==null)
		{
			head=curr;
			curr.next=prev;
			return head;
		}
		Node next1=curr.next;
		curr.next=prev;
		reverseLinkedList(next1,curr);
		return head;
		
	}
	public void printList(Node curr)
	{
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args)
	{
		ReverseLinkedListRecursive rst=new ReverseLinkedListRecursive();
		rst.head=new Node(29);
		rst.head.next=new Node(100);
		rst.head.next.next=new Node(88);
		rst.head.next.next.next=new Node(503);
		Node res=rst.reverseLinkedList(head,null);
		rst.printList(res);
	}

}
