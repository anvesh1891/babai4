package Sample;
//TC:O(nk)
//Simple approach

public class MaxinSlidingWindow {
	public static void findMaxinSlidingWindow(int[] A,int n,int k)
	{
		//return 1;
		int max;
		for(int i=0;i<n-k;i++)
		{
			max=A[i];
			for(int j=1;j<k;j++)
			{
				if(A[i+j]>max)
					max=A[i+j];	
			}
			System.out.println(max);
			
		}
		
	}
	public static void main(String[] args)
	{
		int[] A=new int[] {1,3,-1,-3,5,3,6,7};
		int x=3;
		int y=A.length;
		findMaxinSlidingWindow(A,y,x);
	}

}
