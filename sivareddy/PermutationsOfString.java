package Sample;
public class PermutationsOfString {
	public static void main(String[] args)
	{
		String y = "xyz";
		for(int i=0;i<y.length();i++)
			for(int j=i+1;j<=y.length();j++)
				System.out.println(y.substring(i, j));
	}

}
