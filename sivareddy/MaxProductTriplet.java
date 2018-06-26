package Practise;

import java.util.Arrays;

public class MaxProductTriplet {
	//TC:O(n^3).SC:O(1)
	public static int findMaxTriplet(int[] arr,int n)
	{
		if(n<3)
			return -1;
		int max=0;
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					max=Math.max(max,arr[i]*arr[j]*arr[k]);
		return max;
	}
	//TC:O(nlogn).SC:O(1)
	public static int findMaxTriplet1(int[] arr,int n)
	{
		if(n<3)
			return -1;
		return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-3]*arr[n-2]*arr[n-1]);
	}
	//TC:O(n).SC:O(1)
	public static int findMaxTriplet2(int[] arr,int n)
	{
		if(n<3)
			return -1;
		int max1=0,max2=0,max3=0,min1=0,min2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2)
			{
				max3=max2;
				max2=arr[i];
			}
			else if(arr[i]>max3)
			{
				max3=arr[i];
			}
			if(arr[i]<min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		return Math.max(min1*min2*max1, max1*max2*max3);
	}
	public static void main(String[] args)
	{
		int[] arr={23,2,5,0,-1,-2};
		int n=arr.length;
		System.out.println("Maximum triplet product is: "+findMaxTriplet(arr,n));
		int[] arr1={-23,-25,5,0,-1,-2};
		int n1=arr1.length;
		Arrays.sort(arr1);
		System.out.println("Maximum triplet product is: "+findMaxTriplet1(arr1,n1));
		int[] arr2={-23,-25,5,0,-1,-2};
		int n2=arr2.length;
		System.out.println("Maximum triplet product is: "+findMaxTriplet2(arr2,n2));
		
	}

}
