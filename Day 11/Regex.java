import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[]) {
        String[] arr = {
                "sharma@g.com",
                "vel@g.com",
                "hello.org",
                "hi_abc"
        };
        String str = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)";
        Pattern pattern = Pattern.compile(str);
        for (String st : arr) {
            Matcher matcher = pattern.matcher(st);
            if (matcher.matches()) {
                System.out.print("valid");
            } else {
                System.out.print("Invalid");
            }
        }
    }
}