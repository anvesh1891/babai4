package Sample;
//TC:O(n^2)
//SC:O(1)

public class MyInsertionSort {
	public static void sort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
					arr[j+1]=arr[j];
					j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();	
	}
	public static void main(String[] args)
	{
		int[] arr= {23,5,6,1,0,19};
		sort(arr);
		printArray(arr);
	}

}
