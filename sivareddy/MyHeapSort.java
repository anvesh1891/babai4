package Sample;
//TC in all cases:O(nlogn)
//SC:O(1)

public class MyHeapSort {
	public void sort(int[] arr)
	{
		int n=arr.length;
		//build max heap
		for(int i=n/2-1;i>=0;i--)
			heapify(arr,n,i);
		//heap sort
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			//heapify root element
			heapify(arr,i,0);
		}
	}
	public void heapify(int[] arr,int n,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[largest]<arr[l])
			largest=l;
		if(r<n && arr[largest]<arr[r])
			largest=r;
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr,n,largest);
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
		int[] arr= {12,1,89,45,0,12,76};
		MyHeapSort hs=new MyHeapSort();
		hs.sort(arr);
		System.out.println("Sorted Array is:");
		printArray(arr);
	}

}
