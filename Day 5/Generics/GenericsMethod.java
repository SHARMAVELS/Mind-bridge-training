import java.util.*;
class GenericsMethod
{
    public static<T> void printArray(T[] arr)
    {
        for(T code:arr)
        {
            System.out.print(code+" ");
        }
        System.out.println();
    }
    
    public static void main (String[] args) {
        String[] str={"hi","hello","vanakam"};
        printArray(str);
        Integer[] num={1,2,3,4,5};
        printArray(num);
    }
}