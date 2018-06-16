package Practise1;

import java.util.HashMap;

public class MaxSubArrayWithSumZero {
	//Method 1:TC:O(n^2)
	public static int findMaxSubArray(int[] arr)
	{
		int max_length=0;
		for(int i=0;i<arr.length;i++)
		{
			int curr_sum=0;
			for(int j=i;j<arr.length;j++)
			{
				curr_sum+=arr[j];
				if(curr_sum==0)
				{
					max_length=Math.max(max_length, j-i+1);
				}
			}
		}
		return max_length;
	}
	//Method 2:TC:O(n)
	public static int findMaxSubArray1(int[] arr)
	{
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();		 
        int sum = 0;     
        int max_len = 0;  
        for (int i = 0; i < arr.length; i++)
        {  
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0)
                max_len = 1;
            if (sum == 0)
                max_len = i+1;        
            Integer prev_i = hM.get(sum);           
            if (prev_i != null)
               max_len = Math.max(max_len, i-prev_i);
            else  
               hM.put(sum, i);
        }
        return max_len;
	}
	public static void main(String[] args)
	{
		int[] arr= {9,-2,1,2,-8,7,1,0,0,9};
		System.out.println("Max length of sub array with sum 0 :"+findMaxSubArray(arr));
		System.out.println("Max length of sub array with sum 0 :"+findMaxSubArray1(arr));
	}

}
