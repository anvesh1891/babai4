package Sample;
//TC:O(n)
public class ElementAppearedOnce {
	public static void findElementAppearedOnce(int[] arr)
	{
		int element=arr[0];
		for(int i=1;i<arr.length;i++)
			element^=arr[i];
		System.out.println("Element that appeared once is:"+element);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,2,1,3,4,5,4,5,6,6};
		findElementAppearedOnce(arr);
	}

}
