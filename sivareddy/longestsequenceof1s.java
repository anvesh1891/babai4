package Sample;

public class longestsequenceof1s {
	public static void longeststreakof1s(int[] a, int n)
	{
		int wL=0,wR=0;
		int zeroCount=0;
		int bestL=0,bestWindow=0,bestR=0;
		while(wR<a.length)
		{
			if(zeroCount<=n)
			{
				if(a[wR]==0)
					zeroCount++;
				wR++;
			}
			if(zeroCount>n)
			{
				if(a[wL]==0)
					zeroCount--;
				wL++;
			}
			int curr_Best=wR-wL;
			if(curr_Best>bestWindow)
			{
				bestWindow=wR-wL;
				bestL=wL;
				bestR=wR;
			}		
		}
		for(int i=bestL;i<bestR;i++)
		{
				System.out.print(i +" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,0,1,1,1,0,0,1,0,1};
		int m=1;
		longeststreakof1s(arr,m);
	}

}
