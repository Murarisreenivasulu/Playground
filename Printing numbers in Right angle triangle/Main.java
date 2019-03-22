import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner i=new Scanner(System.in);
      int n=i.nextInt();
      for(int j=1;j<=n;j++)
      {
        for(int k=1;k<=j;k++)
        {
          System.out.printf("%d",j);
        }
        System.out.println(" ");
	}
}
}