import java.util.*;
class Skip
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

     //  int a=sc.nextInt();
      for(int i=0;i<=100;i++)
      {
          if(i%5==0)
          {
              continue;
          }
          System.out.println(i);
      }
    }
}