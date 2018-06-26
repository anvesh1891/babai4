package Practise2;

public class LargestSubArrayWithEqual0s1s {
	//Method1:TC:O(n^2).SC:O(n)
	public static int findSubArray(int[] arr,int n)
	{
		int max_size=-1;
		int sum=0;
		int start_index=0,end_index=0;
		for(int i=0;i<n;i++)
		{
			sum=(arr[i]==0)?-1:1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==0)
					sum+=-1;
				else
					sum+=1;
				if(sum==0 && max_size<j-i+1)
				{
					max_size=j-i+1;
					start_index=i;
				}
			}
		}
		end_index=start_index+max_size-1;
		if(max_size==-1)
			System.out.println("No such sub array exists");
		else
			System.out.println("Max sub array is from: "+start_index+" "+end_index);
		return max_size;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,0,0,1,1,0,0,0,0,1,1,0,0,1,0,1,0};
		int n=arr.length;
		System.out.println("Max_Size: "+findSubArray(arr,n));
	}

}
