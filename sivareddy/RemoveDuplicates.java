package Sample;

public class RemoveDuplicates {
	public static int removeDuplicate(int[] a,int n)
	{
		int[] b=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
			if(a[i]!=a[i+1])
				b[j++]=a[i];
			
		b[j++]=a[n-1];
		
		for(int i=0;i<j;i++)
		{
			a[i]=b[i];
		}
					
		return j;
		
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,3,5};
		int n=arr.length;
		int numbers = removeDuplicate(arr,n);
		for(int i=0;i<numbers;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
