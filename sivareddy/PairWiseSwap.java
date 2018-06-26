package BST;

public class PairWiseSwap {
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	static Node head;
	public void findPairWise()
	{
		Node temp=head;
		while(temp!=null&&temp.next!=null)
		{
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
	}
	public void push(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void printList()
	{
		Node tnode=head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		PairWiseSwap lst=new PairWiseSwap();
		lst.push(23);
		lst.push(34);
		lst.push(1);
		lst.push(2);
		lst.push(90);
		lst.push(100);
		lst.printList();
		System.out.println("After Pairwise swapping:");
		lst.findPairWise();
		lst.printList();
	}

}
