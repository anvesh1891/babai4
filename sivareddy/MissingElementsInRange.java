package Practise2;

import java.util.HashSet;
//TC:O(n)
public class MissingElementsInRange {
	public static void findMissingElementInRange(int[] arr,int low,int high)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
				hs.add(arr[i]);
		}
		for(int i=low;i<=high;i++)
		{
			if(!hs.contains(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {23,90,45,50};
		int low=45;
		int high=47;
		findMissingElementInRange(arr,low,high);
	}

}
