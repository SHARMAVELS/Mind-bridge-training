import java.util.*;
class Varargs
{
    public int  sum(int...number)
    {
        int sum=0;
        for(Integer num:number)
        {
            sum+=num;
        }
        return sum;
    }
}
class Vararg
{
    public static void main (String[] args) {
       Varargs vr=new Varargs();
       System.out.print(vr.sum(1,2,3,4,4,5));
}
}