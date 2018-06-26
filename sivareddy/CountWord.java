package Practise1;

public class CountWord {
	static final int OUT=0;
	static final int IN=1;
	public static int getWordCount(String str)
	{
		int status=OUT;
		int wc=0,i=0;
		while(i<str.length())
		{
			if(str.charAt(i)==' '||str.charAt(i)=='\n'||str.charAt(i)=='\t')
				status=OUT;
			else if(status==OUT)
			{
				status=IN;
				++wc;
			}
			i++;
		}
		return wc;
	}
	public static void main(String[] args)
	{
		String str="This is the string \n program";
		System.out.println("Number of words in given string: "+getWordCount(str));
	}

}
