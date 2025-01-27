package DisplayStudDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Studen {
    private String name;
    private int marks;
    public Studen(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println("Student Name: "+name+"Mark: "+marks);
    }
    public static void main(String[] args) {
        List<Studen> list = new ArrayList<>(
                Arrays.asList(
                        new Studen("arun",43),
                        new Studen("bala",64),
                        new Studen("dev",45)
                )
        );
       list.forEach(Studen::displayStudentDetails);
    }
}


