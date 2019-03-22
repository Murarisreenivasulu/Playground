import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner k=new Scanner(System.in);
      int n=k.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
            if(i==1||i==n||j==1||j==n)
            {
              System.out.printf("*");
            }
            else
              System.out.printf(" ");
          }
          System.out.printf("\n"); 
        }
	}
}