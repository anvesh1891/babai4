package Sample;

public class SwapMaxElement {
	public static void swapArrayElement(int[] A,int[] B)
	{
		int min,max=0;
		for(int i=0;i<B.length;i++)
		{
			max=B[i];
			if(B[i]>max)
				max=B[i];
		}
		for(int i=0;i<A.length-1;i++)
		{	
			min=A[i];	
			if(A[i+1]>min)
				continue;
			else
			{
				A[i+1]=max;
				System.out.println(A[i+1]);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1=new int[] {1,3,7,4,10};
		int[] arr2=new int[] {2,1,5,8,9};
		swapArrayElement(arr1,arr2);
		for(int j=0;j<arr1.length;j++)
			System.out.println(arr1[j]);
	}

}
