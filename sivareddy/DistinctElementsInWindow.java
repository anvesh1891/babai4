package Practise1;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctElementsInWindow {
	//Method 1:TC=O(nk^2)
	public static int countDistinctWindow(int[] arr,int x)
	{
		int dist_count=0;
		for(int i=0;i<x;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
					break;
			}
			if(i==j)
				dist_count++;
		}
		return dist_count;
	}
	public static void countDistinct(int[] arr,int n,int x)
	{
		for(int i=0;i<=n-x;i++)
		{
			System.out.print(countDistinctWindow(Arrays.copyOfRange(arr, i,arr.length),x)+" ");
		}
		System.out.println();
	}
	//Method 2:Using Hashing.TC:O(n)
	public static void countDistinct1(int[] arr,int x)
	{
		int dist_count=0;
		HashMap<Integer,Integer> hmp=new HashMap<Integer,Integer>();
		for(int i=0;i<x;i++)
		{
			if(hmp.get(arr[i])==null)
			{
				hmp.put(arr[i], 1);
				dist_count++;
			}
			else
			{
				int count=hmp.get(arr[i]);
				hmp.put(arr[i],count+1);
			}
		}
		System.out.print(dist_count);
		for(int i=x;i<arr.length;i++)
		{
			if(hmp.get(arr[i-x])==1)
			{
				hmp.remove(arr[i]);
				dist_count--;
			}
			else
			{
				int count=hmp.get(arr[i-x]);
				hmp.put(arr[i-x], count-1);
			}
			
			if(hmp.get(arr[i])==null)
			{
				hmp.put(arr[i], 1);
				dist_count++;
			}
			else
			{
				int count=hmp.get(arr[i]);
				hmp.put(arr[i],count+1);
			}
			System.out.print(" "+dist_count);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {23,98,23,99,25,67,45,31,20,50};
		int x=4;
		countDistinct(arr,arr.length,x);
		countDistinct1(arr,x);
	}

}
