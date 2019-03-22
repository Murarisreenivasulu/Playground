import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner i=new Scanner(System.in);
      int k=i.nextInt();
      if(k==1)
        System.out.println("One");
      else if(k==2)
        System.out.println("Two");
      else if(k==3)
        System.out.println("Three");
      else if(k==4)
        System.out.println("Four");
      else if(k==5)
        System.out.println("Five");
      else
        System.out.println("Invalid");
	}
}