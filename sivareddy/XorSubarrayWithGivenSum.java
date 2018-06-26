package Practise2;

public class XorSubarrayWithGivenSum {
	//TC:O(n^2)
	public static int findSubArray(int[] arr,int n,int x)
	{
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum ^ arr[j];
				if(sum==x)
					ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int[] arr= { 4, 2, 2, 6, 4 };
		int x=6;
		int n=arr.length;
		System.out.println("Number of XOR subarrays with given sum is: "+findSubArray(arr,n,x));
	}

}
