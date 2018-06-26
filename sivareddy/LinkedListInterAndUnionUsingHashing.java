package Practise1;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedListInterAndUnionUsingHashing {
	static Node head1;
	static Node head2;
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
	void findIntersectionAndUnion(Node head1,Node head2)
	{
		HashSet<Integer> union=new HashSet<Integer>();
		HashSet<Integer> intersection=new HashSet<Integer>();
		ArrayList<Integer> UnionList=new ArrayList<Integer>();
		while(head1!=null)
		{
			union.add(head1.data);
			UnionList.add(head1.data);
			head1=head1.next;
		}
		while(head2!=null)
		{
			if(union.contains(head2.data))
				intersection.add(head2.data);
			else
				UnionList.add(head2.data);
			head2=head2.next;
		}
		System.out.println("Intersection of two linked lists are:");
		for(Integer itr:intersection)
			System.out.print(" "+itr);
		System.out.println();
		System.out.println("Union of two linked lists are:");
		for(Integer itr1:UnionList)
			System.out.print(" "+itr1);
	}
	public static void main(String[] args)
	{
		LinkedListInterAndUnionUsingHashing Data=new LinkedListInterAndUnionUsingHashing();
		LinkedListInterAndUnionUsingHashing.head1=new Node(20);
		LinkedListInterAndUnionUsingHashing.head1.next=new Node(25);
		LinkedListInterAndUnionUsingHashing.head1.next.next=new Node(90);
		LinkedListInterAndUnionUsingHashing.head1.next.next.next=new Node(89);
		
		LinkedListInterAndUnionUsingHashing.head2=new Node(90);
		LinkedListInterAndUnionUsingHashing.head2.next=new Node(25);
		LinkedListInterAndUnionUsingHashing.head2.next.next=new Node(100);
		
		Data.findIntersectionAndUnion(head1,head2);
	}

}
