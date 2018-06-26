package Practise1;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayHasGivenSum {
	//1.Simple Method using sorting. TC:O(nlogn)
	public static boolean hasGivenSum(int[] arr,int n,int x)
	{
		int l=0;
		int r=n-1;
		Arrays.sort(arr);
		while(l<r)
		{
			if(arr[l]+arr[r]==x)
				return true;
			else if(arr[l]+arr[r]>x)
				r--;
			else
				l++;
		}
		return false;
	}
	//Method 2:Using Hashing.TC:O(n)
	public static void pairSum(int[] arr,int x)
	{
		HashSet<Integer> hst=new HashSet<Integer>();
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=x-arr[i];
			if(temp>=0 && hst.contains(temp))
				System.out.println("Two numbers with given sum is "+x+" are ("+arr[i]+")"+" and ("+temp+")");
			hst.add(arr[i]);
		}
		if(hst.contains(temp))
			System.out.println("Two numbers with given sum is "+x+" are ("+arr[arr.length-1]+")"+" and ("+temp+")");
	}
	public static void main(String[] args)
	{
		int[] arr= {20,39,43,-10,59,100};
		int n=arr.length;
		int x=90;
		if(hasGivenSum(arr,n,x))
			System.out.println("Array has two elements with given sum");
		else
			System.out.println("Array does not have two elements with given sum");
		pairSum(arr,x);
	}

}
