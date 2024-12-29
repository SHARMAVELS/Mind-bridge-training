import java.util.*;
class Calculator{
     int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int[] arr)
    {
        int n=arr.length;
       int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
       // System.out.print(sum);
        return sum;
    }
    int add(double[] drr)
    {
        int n=drr.length;
       int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=drr[i];
        }
                System.out.print(sum);
                return sum;

    }
}
class Polymorphism
{
    public static void main(String args[])
    {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1.5,2.5));
        int[] arr={1,2,3};
         System.out.println(calculator.add(arr));
         double[] drr={1.2,3.2};
                 System.out.println(calculator.add(drr));



    }
}