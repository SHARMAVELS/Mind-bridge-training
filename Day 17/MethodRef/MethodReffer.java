

class Stud{
    private String name;
    private int marks;

    public String getName()
 {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
@FunctionalInterface
interface StudentFactory{
    Student create(String name,int marks);
}
public class MethodRefConsEx {
    public static void main(String[] args) {
        StudentFactory fact = Student::new;
        Student fact1 = fact.create("gowtham",50);
        Student fact2 = fact.create("sudhakar",60);
        System.out.println(fact1.getName()+" "+fact1.getMarks());
        System.out.println(fact2.getName()+" "+fact2.getMarks());
    }
}
