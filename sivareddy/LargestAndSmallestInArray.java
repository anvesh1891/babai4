package Sample;
//TC:O(n).O(logn) not possible for this.
public class LargestAndSmallestInArray {
	public static void findLargestAndSmallest(int[] arr)
	{
		int min=arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Smallest element is:"+min);
		System.out.println("Largest element is:"+max);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2345353,-3232,4224523,-35353535};
		findLargestAndSmallest(arr);
	}
}
