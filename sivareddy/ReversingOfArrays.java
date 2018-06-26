package Practise;

public class ReversingOfArrays {
	//Method1:Recursive way. TC:O(n)
	public static void reverseArray1(int[] arr,int start,int end)
	{
		int temp;
		if(start>=end)
			return;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverseArray1(arr,start+1,end-1);
	}
	//Method1:Iterative way. TC:O(n)
	public static void reverseArray(int[] arr,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] arr={2,3,4,0,67,98};
		int[] arr1={1,2,3,4,5,6};
		int n=arr.length;
		int n1=arr1.length;
		printArray(arr,n);
		reverseArray(arr,0,n-1);
		System.out.println("Array elements after reversing are:");
		printArray(arr,n);
		printArray(arr1,n1);
		reverseArray1(arr1,0,n1-1);
		System.out.println("Array elements after reversing are:");
		printArray(arr1,n1);
	}

}
