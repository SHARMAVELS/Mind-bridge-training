import java.util.*;
class Student implements Cloneable
{
    String name;
    int age;
    
    Student(String str,int ag)
    {
        name=str;
        age=ag;
    System.out.println("Name: "+name+"  Age: "+age);
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class CloneExample
{
    public static void main (String[] args) {
        try{
        Student stu=new Student("john",20);
        Student st=(Student)stu.clone();
        
        System.out.println(stu==st);
        System.out.print(stu.equals(st));
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}