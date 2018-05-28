package Sample;
//Stable Sorting
//TC-O(n^2)-comparisons and swaps
//SC-constant
public class MyBubbleSort {
	public static void bubbleSort(int[] A)
	{
		int n=A.length;
		int k;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				k=j+1;
				if(A[j]>A[k])
					swap(A,j,k);
			}
		}
		printNumbers(A);
	}
	public static void swap(int[] Array,int i,int k)
	{
		int temp;
		temp=Array[i];
		Array[i]=Array[k];
		Array[k]=temp;
	}
	public static void printNumbers(int[] Array)
	{
		for(int j=0;j<Array.length;j++)
			System.out.print(Array[j]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr= {4,2,21,3,0,25,98,15,87,99,211};
		bubbleSort(arr);
	}

}
