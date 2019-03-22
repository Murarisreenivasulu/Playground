import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner k=new Scanner(System.in);
      int array_size=k.nextInt();
      int array[]=new int[array_size];
      for(int i=0;i<=array_size-1;i++)
      {
        array[i]=k.nextInt();
      }
      int max;
      if(array[0]>array[1])
      {
        max=array[0];
      }
      else
      {
        max=array[1];
      }
      for(int i=2;i<=array_size-1;i++)
      {
        if(max<array[i])
        {
          max=array[i];
        }
      }
      System.out.println(max);
    }
}