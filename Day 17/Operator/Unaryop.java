package UnaryOper;

import java.util.function.UnaryOperator;

public class Unaryop {
    public static void main(String[] args) {
     UnaryOperator<String> unary =  str ->  str.toUpperCase();
        System.out.println ("UpperCase:"+unary.apply("hey"));
    }
}
