

import java.util.*;
import java.util.stream.Collectors;

public class StudentPerformance {
    public static void main(String[] args) {
        List<Student> students =
                Arrays.asList(
                        new Student("hari","ECE",Arrays.asList(23,45,34,12,56)),
                        new Student("vishnu","CSBS",Arrays.asList(56,34,56,76,45)),

                        new Student("boss","AIML",Arrays.asList(65,45,32,76,54)),
                        new Student("navi","ECE",Arrays.asList(65,45,65,65,87)),

                        new Student("Karthi","CSBS",Arrays.asList(67,56,87,45,65)),

                        new Student("prathi","AIML",Arrays.asList(87,67,77,68,96))
                        );

        List<Student> toppers = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverage).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(" top students :"+toppers);

        System.out.println(" ");
        
Map<String, Double> deptAverages = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getAverage)));
                 System.out.println(" Average for each department :");

        deptAverages.forEach((dept, avg)->System.out.println(dept + ": " + avg));

    
 System.out.println(" ");

       
 Map<String, Optional<Student>> topStudentInEachDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparingDouble(Student::getAverage))));
        System.out.println("Topstudent in department :");

       
 topStudentInEachDept.forEach((dept,student)->System.out.println(dept + ":" + student.orElse(null).name));

      System.out.println(" ");
  Long failedStudents = students.stream()
             .filter(student->student.getAverage() < 50)
                .collect(Collectors.counting());
        System.out.println("Failed students  : " + failedStudents);
    }
}
