package Sample;

public class MinimumCharactersPalindrome {
	public static boolean isPalindrome(String s)
	{
		char[] x=s.toCharArray();
		for(int i=0,j=x.length-1;i<=j && j>0;i++,j--)
		{
		if(x[i]!=x[j])
			return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
	   //boolean n=isPalindrome("ABADABA");
	   String s="SIVA";
	   int count=0;
	   int flag=0;
	   while(s.length()>0)
	   {
	   if(isPalindrome(s))
	   {
		   flag=0;
		   break;
	   }
	   else
	   {
		   flag=1;
		   count++;
		   s=s.substring(0, s.length()-1);
	   }
	   }
	   //if(flag==1)
	   System.out.println(count);
	}

}
