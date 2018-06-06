package Practise1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesinString {
	//TC:O(nlogn)
	public static String removeDuplicates(String str)
	{
		int ip_ind=1,res_ind=1;
		char[] temp=str.toCharArray();
		while (ip_ind != temp.length)
		{
			if(temp[ip_ind]!=temp[ip_ind-1])
			{
				temp[res_ind]=temp[ip_ind];
				res_ind++;
			}
			ip_ind++;
		}
		str=new String(temp);
		return str.substring(0, res_ind);
	}
	public static String removeDups(String str)
	{
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		str=new String(arr);
		return removeDuplicates(str);
	}
	//TC:O(n)
	public static void removeDups1(String str)
	{
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
			lhs.add(str.charAt(i));
		for(Character ch:lhs)
			System.out.print(ch);
		
		
	}
	public static void main(String[] args)
	{
		String str="anveshbabai";
		System.out.println("After removing duplicates in string: "+removeDups(str));
		String str1="jaipalbabai";
		System.out.print("After removing duplicates in string: ");
		removeDups1(str1);
	}

}
