import java.util.*;
class Autoboxing
{
    public static void main (String[] args) {
        int[] n={1,2,3,4};
      List<Integer> list=new ArrayList<>();
      for(int num:n)
      {
          list.add(num);
      }
      System.out.print(list);
    }
}