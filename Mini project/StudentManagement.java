import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student implements Serializable
{
    private int id;
    private String name;
    private int age;
    private String grade;
    
    public Student(int id,String name,int age,String grade)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        return "ID: "+id+" Name : "+name+" Age : "+age+" Grade : "+grade;
    }
}
@FunctionalInterface
interface Studentprocess
{
    void process(Student student);
}

class Filewritter
{
    private static final ExecutorService executor=Executors.newSingleThreadExecutor();
    
    public static void saveData(Runnable saveTask)
    {
        executor.submit(saveTask);
    }
    
    public static void shutdown()
    {
        executor.shutdown();
    }
}

class StudentManager{
    private List<Student> students;
    private static final String File_path="Students.dat";
    
    
    public StudentManager(){
        this.students=new ArrayList<>();
        loadStudents();
    }
    public void addStudents(Student student)
    {
        students.add(student);
        saveStudents();
    }
    public void removeStudent(int id)
    {
        students.removeIf(student-> student.getId()==id);
        saveStudents();
    }
    public List<Student> getAllStudents()
    {
return students ;
}

public List<Student> filterStuents(Predicate<Student> predicate)
{
    return students.stream().filter(predicate).collect(Collectors.toList());
}
public List<Student> sortStudentsbyname()
{
    return students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
}

private void saveStudents()
{
    Filewritter.saveData(() ->{
        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(File_path))){
        oos.writeObject(students);
        } catch (IOException e)
        {
            System.err.println("Error saving students: " +e.getMessage());
        }
    });
}
      private void loadStudents()
      {
          try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(File_path)))
          {
              students=(List<Student>)ois.readObject();
          }
          catch(IOException | ClassNotFoundException e)
          {
              students =new ArrayList<>();
          }
      }
    
}


class Main
{
    public static void main (String[] args) {
        StudentManager manager=new StudentManager();
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Add Student : 1");
            System.out.println("Remove Student : 2");
            System.out.println("Display Student : 3");
            System.out.println("Filter by Grade : 4");
            System.out.println("Sort by Name : 5");
            System.out.println("Exit : 6");
            
            System.out.println("Enter choice :");
            
            int choice=sc.nextInt();
            
            switch(choice){
                case 1->
                {
                    System.out.print("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Age: ");
                                        int age=sc.nextInt();
                                        
                    sc.nextLine();
                    System.out.print("Enter Grade : ");
                    String grade=sc.nextLine();
                    
                    manager.addStudents(new Student(id,name,age,grade));

                    
                }
                case 2->
                {
                    System.out.print("Enter Student ID to remove: ");
                    int id=sc.nextInt();
                    manager.removeStudent(id);
                }
                case 3 -> manager.getAllStudents().forEach(System.out::println);
                case 4 -> manager.filterStuents(s -> "A".equalsIgnoreCase(s.getGrade())).forEach(System.out::println);
                case 5 ->manager.sortStudentsbyname().forEach(System.out::println);
                case 6 ->
                {
                    Filewritter.shutdown();
                    System.out.println("exit...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice ");
            }
            
        }
    }
}