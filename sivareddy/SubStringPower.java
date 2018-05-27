package Sample;


public class SubStringPower {
	public static void findSubstring(String s,int n)
	{
		int current_power=0;
		int current_power1=0;
		int flag=0;
		char[] x=s.toCharArray();
		for(int i=0;i<x.length;i++)
		{
			current_power=current_power+(x[i]-'a'+1);
			//System.out.println(current_power);
			if(n==current_power)
			{
				flag=1;
			    System.out.printf("Substring with given power %d available from index 0 to %d", n,i);
			    break;
			}
			//System.out.println(m.get(i)-m.get(n));
			/*if(m.get(i)-m.get(n)!=m.get(i))
			{
				System.out.printf("Substring with given power %d available from index %i to n", i,n);
				break;
			}*/
			
			for(int j=i;j<x.length;j++)
			{
				current_power1=current_power1+(x[j]-'a'+1);
				
				if(current_power1==n)
				{
					flag=1;
					System.out.printf("Substring with given power %d available from index %d to %d",n,i,j);
					System.out.println();
				}	
				System.out.println(current_power1);
			}		
			current_power1=0;
		}
		
		if(flag==0)
		System.out.printf("Substring with given power %d not available in %s",n,s);
	}
	public static void main(String[] args)
	{
		String str="abcde";
		int n=14;
		findSubstring(str,n);
	}

}
