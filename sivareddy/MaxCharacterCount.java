package Practise1;

public class MaxCharacterCount {
	static final int ASCII_SIZE=256;
	public static char getMaxCharacterCount(String str)
	{
		int[] count=new int[ASCII_SIZE];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		int i=0,max_Count=0;
		char result = ' ';
		while(i<str.length())
		{
			if(count[str.charAt(i)]>max_Count)
			{
				max_Count=count[str.charAt(i)];
				result=str.charAt(i);
			}
			i++;
		}
		System.out.println("Number of times character occured:"+max_Count);
		return result;
	}
	public static void main(String[] args)
	{
		String str="anvesh babai is great";
		System.out.println("Maximum occured character is: "+ getMaxCharacterCount(str));
	}

}
