package Practise;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementUsingQueues {
	//Method 1: By making push operation costly
	private Queue<Integer> q1=new LinkedList<>();
	private Queue<Integer> q2=new LinkedList<>();
	private int top;
	public void push(int x)
	{
		q2.add(x);
		top=x;
		while(!q1.isEmpty())
		{
			q2.add(q1.remove());	
		}
		Queue<Integer> temp=q1;
		q1=q2;
		q2=temp;
	}
	public void pop()
	{
		q1.remove();
		if(!q1.isEmpty())
		{
			top=q1.peek();
			System.out.println("Element removed is:"+top);
		}
	}
	public int top()
	{
		return top;
	}
	public boolean empty()
	{
		return q1.isEmpty();
	}
	public static void main(String[] args)
	{
		StackImplementUsingQueues s=new StackImplementUsingQueues();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println("Top element:"+s.top());
		if(s.empty())
			System.out.println("Queue is empty");
		else
			System.out.println("Queue is not empty");
	}

}
