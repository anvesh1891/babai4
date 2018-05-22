package Sample;

public class Palindrome {
	public static void checkPalindrome(String x)
	{
		String y=new StringBuffer(x).reverse().toString();
		if(x.equals(y))
			System.out.println("Given String: "+x+" is a palindrome");
		else 
			System.out.println("Given String: "+x+" is not a palindrome");
	}
	
	public static void main(String[] args)
	{
		checkPalindrome("Hello");
		checkPalindrome("ABA");
	}

}
