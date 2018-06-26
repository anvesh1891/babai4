package Sample1;
//TC:O(n)
public class LinearSearch {
	public static int findElement(int[] arr,int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {23,24,90,1,89,100};
		int n=arr.length;
		int x=240;
		int k=findElement(arr,n,x);
		if(k==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at:"+k);
	}

}
