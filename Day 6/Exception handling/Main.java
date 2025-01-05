import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try {
        int a=sc.nextInt();
        int b=sc.nextInt();
            int c=a/b;
        } catch(ArithmeticException e) {
            System.out.print("Arithmetic Exception");
        }
        catch(InputMismatchException e)
        {
            System.out.print("Input is not valid");
        }
        catch(Exception e)
        {
            System.out.print("An unexpected error occured");
        }
       
        
    }
}