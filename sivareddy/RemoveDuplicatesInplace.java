package Sample;

public class RemoveDuplicatesInplace {
	
	public static int removeDuplicates(int[] a, int n)
	{
		if(n==0 || n==1)
		  return n;
		int j=0;
		for(int i=0;i<n-1;i++)
			if(a[i]!=a[i+1])
			  a[j++]=a[i];
        a[j++]=a[n-1];
        return j;
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,3,5};
		int x=arr.length;
		int n=removeDuplicates(arr,x);
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
