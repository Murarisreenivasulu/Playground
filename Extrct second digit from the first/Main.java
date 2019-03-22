import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner i=new Scanner(System.in);
      int num=i.nextInt();
      while(num>=99)
      {
        num=num/10;
      }
      int k=num%10;
      System.out.println(k);
    }
}