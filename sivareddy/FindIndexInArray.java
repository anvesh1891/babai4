package Sample;
public class FindIndexInArray {
	public static void main(String[] args)
	{
		int[] arr=new int[] {3,5,6};
		int target=4;
		for(int i=0;i<arr.length;i++)
		{
			if(i==target)
			{
				System.out.println(i);
				break;
			}
			if(target==arr[i])
			{
				System.out.println(i);
				break;
			}
		}	
	}
}
