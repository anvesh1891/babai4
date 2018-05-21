//Fibonacci using DP - Memorized Approach
//TC:O(n)
//SC:O(n)
class FibonacciMemorized {
  public static int fib(int n)
  {
    //Array to store fibonacci numbers
    int[] f=new int[n+1];
    f[1]=1;
    f[2]=1;
    for(int i=3;i<=n;i++)
    {
      f[i]=f[i-1]+f[i-2];
    }
    return f[n];
  }
  public static void main(String[] args) {

    int n=6;
    System.out.println("Fibonacci number is:"+fib(n));

  }
}
