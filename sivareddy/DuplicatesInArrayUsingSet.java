//TC:O(n)
package Sample;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayUsingSet {
	public static void findDuplicates(int[] arr)
	{
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(s.add(arr[i])==false)
				System.out.println("Found Duplicate:"+arr[i]);
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {2,2,8,9,10,10,12,4,5,1};
		findDuplicates(arr);
	}

}
