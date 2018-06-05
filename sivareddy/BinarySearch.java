package Sample1;
//TC:O(logn)
public class BinarySearch {
	public static int binarySearch(int[] arr,int l,int h,int x)
	{
		if(l<=h)
		{
			int mid=l+(h-l)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				return binarySearch(arr,0,mid-1,x);
			else
				return binarySearch(arr,mid+1,h,x);
		}
		return -1;
	}
	public static int binarySearchRecursive(int[] arr,int l,int h,int x)
	{
		
		while (l <= h)
        {
            int mid= l + (h-l)/2;
 
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
 
            // If x greater, ignore left half
            if (arr[mid] < x)
                l = mid + 1;
 
            // If x is smaller, ignore right half
            else
                h = mid - 1;
        }
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {21,89,45,87,90,34};
		int n=arr.length;
		int x=45;
		int y=90;
		int result=binarySearch(arr,0,n-1,x);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at:"+result);
		int result1=binarySearchRecursive(arr,0,n-1,y);
		if(result1==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at:"+result1);
	}

}
