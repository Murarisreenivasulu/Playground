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
          if(i%2==0)
            {
              if(j==1)
              {
              System.out.printf("%d",i+1);
              }
            else
              System.out.printf("%d",i);
          }
          else
          {
            if(j==n)
            {
          System.out.printf("%d",i+1);
              break;
            }
            else
            {
              System.out.printf("%d",i);
            }
          }
        }
         System.out.printf("\n");
      }
    }
}
