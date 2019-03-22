import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner m=new Scanner(System.in);
      int num=m.nextInt();
      int copy=num;
      int sum=0;
      while(num>0)
      {
       int k=num%10;
        sum=sum+k*k*k;
        num=num/10;
	}
      if(sum==copy)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}