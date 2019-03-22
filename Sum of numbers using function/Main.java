import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
     Scanner k=new Scanner(System.in);
      int n=k.nextInt();
      int sum=sop(n);
      System.out.printf("%d",sum);
	}
  public static int sop(int n)
  {
    int g=0;
    for(int i=0;i<=n;i++)
    {
       g=g+i;
    }
    return g;
  }
}