import java.util.*;
class Student
{
    
    Student(String name,int age)
    {
        System.out.print("Name is:"+name+" and age is:"+age);
    }
}
class Parameterized
{
    public static void main(String args[])
    {
        Student st=new Student("john",18);
        
    }
}