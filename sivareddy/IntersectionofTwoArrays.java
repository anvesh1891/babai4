package Sample;

public class IntersectionofTwoArrays {
	//Using two for loops. TC:O(n^2)
	public static void findIntersection(int[] A,int[] B)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				if(A[i]==B[j])
					System.out.println("Intersected Element is:"+A[i]);
			}
		}
	}
	//Using Single for loop. TC:O(n)
	public static void findIntersection1(int[] A,int[] B)
	{
		int i=0,j=0;
		while(i<A.length && j<B.length)
		{
			if(A[i]<B[j])
				i++;
			else if(A[i]>B[j])
				j++;
			else
			{
				System.out.println("Intersected Element is:"+A[i]);
				break;
			}
			
		}
	}
	public static void main(String[] args)
	{
		int[] A= {1,2,4,6,7,9};
		int[] B= {5,6,8,10,11};
		findIntersection(A,B);
		findIntersection1(A,B);
	}

}
