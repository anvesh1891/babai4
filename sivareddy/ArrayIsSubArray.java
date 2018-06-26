package Practise1;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIsSubArray {
	//Method1:Using two for loops.TC: O(mn)
		public static boolean isSubset(int[] arr1,int[] arr2,int m,int n)
		{
			int j=0;
			for(int i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					if(arr1[i]==arr2[j])
						break;
					
				}
				if(j==n)
					return false;
			}
			return true;
		}
	
	//Method2:Using sorting.TC: O(mlogm+nlogn)
	public static boolean isSubset1(int[] arr1,int[] arr2,int m,int n)
	{
		int i=0,j=0;
		if(n<m)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<m && j<n)
		{
			if(arr2[j]<arr1[i])
				j++;
			else if(arr1[i]==arr2[j])
			{
				i++;
				j++;
			}
			else if(arr2[j]>arr1[i])
				return false;
		}
		if(j<n)
			return false;
		else
			return true;
	}
	//Method3:Using Hashing.TC: O(n)
    public static boolean isSubset2(int[] arr1,int[] arr2,int m,int n)
    {
    	    HashSet<Integer> hst=new HashSet<>();
    	    for(int i=0;i<n;i++)
    	    {
    	    	   if(!hst.contains(arr2[i]))
    	    		   hst.add(arr2[i]);
    	    }
    	    for(int j=0;j<m;j++)
    	    {
    	    	   if(!hst.contains(arr1[j]))
    	    		   return false;
    	    }
    	    return true;
    	    
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {89,20,23};
		int[] arr2= {23,89,45,20,34,9};
		int m=arr1.length;
		int n=arr2.length;
		if(isSubset(arr1,arr2,m,n))
			System.out.println("arr1[] is"+" subset of arr2[]");
		else
			System.out.println("arr1[] is not"+" subset of arr2[]");
		if(isSubset1(arr1,arr2,m,n))
			System.out.println("arr1[] is"+" subset of arr2[]");
		else
			System.out.println("arr1[] is not"+" subset of arr2[]");
		if(isSubset2(arr1,arr2,m,n))
			System.out.println("arr1[] is"+" subset of arr2[]");
		else
			System.out.println("arr1[] is not"+" subset of arr2[]");
	}

}
