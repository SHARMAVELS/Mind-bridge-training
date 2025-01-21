import java.util.*;
import java.util.stream.Collectors;

public class StudentDept {
    String name;
    String dept;
    int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public StudentDept(String name, String dept, int score) {
        this.name = name;
        this.dept = dept;
        this.score = score;
    }

    public static  void main(String[] args) {
        List<StudentDept> list = new ArrayList<>(
                Arrays.asList(
                        new StudentDept("john","ECE",50),
                        new StudentDept("balu","ECE",60),
                        new StudentDept("arun","CSBS",70),
                        new StudentDept("don","CSBS",50),
                        new StudentDept("joe","EEE",70),
                        new StudentDept("bob","EEE",50)

                        )
        );
        Map<String,StudentDept>  map = topScore(list);
        map.forEach((dept,StudentDept)->{
            System.out.println(" TopScorer "+  StudentDept.getName() +" " +  dept  + " Score is : " + StudentDept.getScore());
        });
        }

    private static Map<String, StudentDept> topScore(List<StudentDept> list) {
        return list.stream().collect(Collectors.groupingBy(
                        StudentDept::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(StudentDept::getScore)),Optional::orElseThrow)
                )
        );
    }
}