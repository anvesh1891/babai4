package Sample;

public class DuplicatesInArray {
	public static void printDuplicates(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Found Duplicate Element:"+arr[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,3,4,4,5,6,6,7,7,9,9,9};
		printDuplicates(arr);
	}

}
