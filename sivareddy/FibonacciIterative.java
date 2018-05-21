
class FibonacciIterative {
  public static int fib(int n)
  {
    if(n==1||n==2)
      return 1;
    int a=1;
    int b=1;
    for(int i=3;i<=n;i++)
    {
      int tmp=a;
      a=b;
      b+=tmp;
    }
    return b;
  }
  public static void main(String[] args) {

    int n=6;
    System.out.println("Fibonacci number is:"+fib(n));

  }
}
