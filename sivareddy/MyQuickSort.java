package Sample;
//TC:O(nlogn),worstcase:O(n^2)
//SC:O(n)

public class MyQuickSort {
	public static int partition(int[] arr,int l,int r)
	{
		int pivot=arr[r];
		int i=l-1;
		for(int j=l;j<r;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp;
		
		return i+1;
	}
	public static void sort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int p=partition(arr,l,r);
			sort(arr,l,p-1);
			sort(arr,p+1,r);	 
		}
	}
	public static void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr= {11,2,90,43,89,43,0,70};
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
}
