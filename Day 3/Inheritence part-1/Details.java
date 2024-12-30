import java.util.*;
class Person
{
    String name="john";
    int age=8;
    
}
class Student extends Person
{
    int Rollnum=38;
    int mark=98;
    void detail(){
    System.out.println("Person name is : "+name+" age is :"+age);
    System.out.print("Student Rollnum is: "+Rollnum+" and mark is :"+mark);}
}
class Details
{
    public static void main(String args[])
    {
     Student st=new Student();
     st.detail();
    }
}