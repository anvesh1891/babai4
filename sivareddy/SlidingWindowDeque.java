package Sample;

import java.util.Deque;
import java.util.LinkedList;

//TC:O(n)
public class SlidingWindowDeque {
	public static void findMaxUsingDeque(int[] A,int n,int k)
	{
		Deque<Integer> Q=new LinkedList<Integer>();
		int i;
		for(i=0;i<k;i++)
		{
			while(!Q.isEmpty()&&A[i]>=A[Q.peekLast()])
				Q.removeLast();
			Q.addLast(i);
		}
		for(;i<n;i++)
		{
			System.out.println(A[Q.peek()]);
			while(!Q.isEmpty()&&Q.peek()<=i-k)
				Q.removeLast();
			while(!Q.isEmpty()&&A[i]>=A[Q.peekLast()])
				Q.removeLast();
			Q.addLast(i);
		}
		System.out.println(A[Q.peek()]);
	}
	public static void main(String[] args)
	{
		int[] Arr=new int[] {1,3,-1,-3,5,3,6,7};
		int n=Arr.length;
		int k=3;
		findMaxUsingDeque(Arr,n,k);
	}

}
