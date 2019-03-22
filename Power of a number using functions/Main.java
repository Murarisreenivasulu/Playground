import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=in.nextInt();
      int k=1;
      while(i!=0)
      {
        k=k*n;
        i--;
      }
      System.out.printf("%d",k);
	}
}