import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner k=new Scanner(System.in);
      int n=k.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++)
        sum=sum+i;
      System.out.println(sum);
	}
}