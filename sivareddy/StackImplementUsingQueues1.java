package Practise;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementUsingQueues1 {
	//Stack Implementation using two queues. Making pop operation costly i.e.O(n). push operation:O(1)
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	private int top;
	public void push(int x)
	{
		q1.add(x);
		top=x;
	}
	public void pop()
	{
		while(q1.size()>1)
		{
			top=q1.remove();
			q2.add(top);
		}
		q1.remove();
		Queue<Integer> temp=q1;
		q1=q2;
		q2=temp;
	}
	public int top()
	{
		return q1.peek();
	}
	public boolean empty()
	{
		return q1.isEmpty();
	}
	public static void main(String[] args)
	{
		StackImplementUsingQueues1 stack= new StackImplementUsingQueues1();
		stack.push(23);
		stack.push(99);
		stack.push(12);
		stack.push(77);
		stack.push(100);
		stack.pop();
		System.out.println("Top element is:"+stack.top());
		if(stack.empty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}

}
