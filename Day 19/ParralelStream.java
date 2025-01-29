import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void task(List<Integer> list){
    
 list.stream().parallel().filter(num->num>50)
         .map(num1 ->num1*num1)
                .limit(10)
        
    .forEach(System.out::println);
    }
   
 public static void main(String[] args) {
     List<Integer> list= Arrays.asList(46,45,87,43,76,87,56,47,57,97,57,63,84);
        task(list);
    }
}