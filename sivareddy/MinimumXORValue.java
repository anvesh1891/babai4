package Sample;

public class MinimumXORValue {
	public static void main(String[] args)
	{
		int a[]=new int[] {0,4,7,9};
		int x=a[0]^a[1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(x<(a[i]^a[j]))
					continue;
				x=a[i]^a[j];
				
			}
		}
		System.out.println(x);
	}			
}
