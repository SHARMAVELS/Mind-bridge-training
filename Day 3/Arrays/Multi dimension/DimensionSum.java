import java.util.*;
class Multidimension
{
    public static void main(String args[])
    {
        int[][] arr={
            {10,11,45,53},
            {12,13,24,33},
            {22,34,54,33},
            {33,23,21,44}
            
        };
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            sum+=arr[i][j];
        }
      
    }
    System.out.println(sum);
    }
}