

import java.util.function.BinaryOperator;

public class Binaryop {
    public static void main(String[] args) {
      BinaryOperator<Integer> binary =   (n1, n2)-> Math.max(n1,n2);
        System.out.println("Max two: "+binary.apply(5,6));
    }
}
