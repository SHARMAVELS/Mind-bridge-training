import java.util.*;
class Array
{
    public static void main(String args[])
    {
        int[] arr={10,11,45,53};
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
            
        }
        if(min>arr[i])
        {
            min=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
    }
}