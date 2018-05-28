package Sample;

import java.util.Arrays;

public class MyBubbleSortRecursive {
	public static void bubbleSort(int[] A,int n)
	{
		boolean isSorted=true;
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
			if(A[i]>A[i+1])
			{
				isSorted=false;
				int temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
			}
		if(!isSorted)
		bubbleSort(A,n-1);
	}
	public static void main(String[] args)
	{
		int[] arr= {23,2,4,19,21,90,28,0};
		int n=arr.length;
		bubbleSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
