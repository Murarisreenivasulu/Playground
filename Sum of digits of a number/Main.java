import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner i=new Scanner(System.in);
      int num=i.nextInt();
      int sum=0;
      while(num!=0)
      {
        int k=num%10;
        sum=sum+k;
        num=num/10;   
	}
      System.out.println(sum);
}
}