import java.util.*;
class CustomException extends Exception
{
    public CustomException(String msg)
    {
        super(msg);
    }
}
class Exception
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        }
        catch(ArithmeticException e)
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        catch(InputMismatchException e)
        {
            throw new InputMismatchException("Invalid input. Please enter numeric values.");
        }
        catch(Exception e)
        {
            try{
            throw new CustomException("An error occured");
            }
            catch(CustomException ce)
            {
                System.out.print(ce.getMessage());
            }
        }
        
    }
}