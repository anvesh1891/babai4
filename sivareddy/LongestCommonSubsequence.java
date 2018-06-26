package Practise2;

public class LongestCommonSubsequence {
	//Method 1:Naive Approach. TC:O(2^n)
	public static int findLCS(char[] X,char[] Y,int m,int n)
	{
		if(m==0||n==0)
			return 0;
		else if(X[m-1]==Y[n-1])
			return 1+findLCS(X,Y,m-1,n-1);
		else
			return max(findLCS(X,Y,m-1,n),findLCS(X,Y,m,n-1));
	}
	//Method2:Memorization technique. TC:O(mn)
	public static int findLCS1(char[] X,char[] Y,int m,int n)
	{
		int[][] L=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
					L[i][j]=0;
				else if(X[i-1]==Y[j-1])
					L[i][j]=1+L[i-1][j-1];
				else
					L[i][j]=max1(L[i][j-1],L[i-1][j]);
			}
		}
		return L[m][n];
	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int max1(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args)
	{
		String s1="ADRTQWABC";
		String s2="ABCPTRWABC";
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int m=X.length;
		int n=Y.length;
		System.out.println("Length of Longest Common Subsequence is:"+findLCS(X,Y,m,n));
		System.out.println("Length of Longest Common Subsequence is:"+findLCS1(X,Y,m,n));
	}

}
