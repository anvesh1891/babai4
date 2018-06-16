package Practise1;

import java.util.HashMap;

public class TwoPairSumEqual {
	static class Pair
	{
		int first,second;
		Pair(int f,int s)
		{
			first=f;
			second=s;
		}
	}
	public static boolean findTwoPairSum(int[] arr)
	{
		HashMap<Integer,Pair> hmp=new HashMap<Integer,Pair>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(!hmp.containsKey(sum))
				{
					hmp.put(sum,new Pair(i,j));
				}
				else
				{
					Pair p=hmp.get(sum);
					System.out.println("Two Pair Sum is available. First pair is:"+arr[i]+" and "+arr[j]+" and "+"Second Pair is: "+ arr[p.first]+" and "+arr[p.second]);
				    return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,9,90,87,65,82};
		findTwoPairSum(arr);
	}

}
