import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner k=new Scanner(System.in);
      int h=k.nextInt();
      int answer=square(h);
      System.out.printf("%d",answer);
	} 
  public static int square(int n)
  {
    return(n*n);
  }
}