package Practise1;

import java.util.regex.Pattern;

public class ReverseWordsInString {
	public String getReverseWords(String str)
	{
		Pattern pattern=Pattern.compile("\\s");
		String[] temp=pattern.split(str);
		String result="";
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
				result=temp[i]+result;
			else
				result=" "+temp[i]+result;
		}
		return result;
	}
	public static void main(String[] args)
	{
		String str="Welcome to the Data Structures and Algorithms";
		ReverseWordsInString rws=new ReverseWordsInString();
		System.out.println("Get words of string in reverse order:  "+rws.getReverseWords(str));
	}

}
