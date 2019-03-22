import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sr=new Scanner(System.in);
      int n=sr.nextInt();
      int last=n%10;
      int k=0;
      while(n>=10)
      {
        n=n/10;
      }
      k=n;
      int sum=k+last;
  System.out.println(sum);
	}
}