import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner i=new Scanner(System.in);
    int n=i.nextInt();
    int m=3;
    for(int j=1;j<=n;j++)
    {
      System.out.printf("%d",j);
      if(j%m==0 && n!=j)
      {
        System.out.printf(",");
      }
    }
  }
}