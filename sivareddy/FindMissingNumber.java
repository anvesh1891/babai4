package Sample;

import java.util.BitSet;

public class FindMissingNumber {
	//We can find one missing number in array using this approach
	public static void findMissingNumber(int[] arr,int count)
	{
		int expectedSum=count*((count+1))/2;
		int actualSum=0;
		for(int i=0;i<arr.length;i++)
			actualSum+=arr[i];
		System.out.println("Missing Number is:"+(expectedSum-actualSum));
	}
	//We can find multiple missing numbers with this approach
	public static void findMissingNumber1(int[] arr,int count)
	{
		int misssingCount=count-arr.length;
		BitSet bst=new BitSet(count);
		for(int i:arr)
			bst.set(i-1); 
		int lastMissingIndex=0;
		for(int i=0;i<misssingCount;i++)
		{
			lastMissingIndex=bst.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,6,7,8};
		int[] arr1= {1,5,7,9};
		findMissingNumber(arr,8);
		findMissingNumber1(arr1,9);
	}

}
