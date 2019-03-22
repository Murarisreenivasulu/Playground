import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner i=new Scanner(System.in);
      int n=i.nextInt();
      int flag=0;
      for(int j=1;j<=n;j++)
      {
        for(int l=1;l<=j;l++)
        {
          if(flag==0)
          {
            System.out.printf("*");
            flag=1;
          }
          else
          {
            System.out.printf("#");
            flag=0;
          }
        }
        System.out.println(" ");
    }
}
}