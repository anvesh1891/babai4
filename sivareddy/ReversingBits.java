package Sample;

public class ReversingBits {
	public static void main(String[] args)
	{
		int a=3;
		long rev = 0;
		for (int i = 0; i < 32; i++, a >>= 1)
			rev = (rev << 1) | (a & 1);
		System.out.println(rev);   	
	}

}
