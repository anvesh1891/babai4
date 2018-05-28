package Sample;

import java.util.Arrays;

public class MySelectionSort {
	public static void selectionSort(int[] A,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(A[j]<A[min_idx])
					min_idx=j;
			}
			int temp=A[i];
			A[i]=A[min_idx];
			A[min_idx]=temp;
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {22,9,23,98,0,1,87};
		int n=arr.length;
		selectionSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
