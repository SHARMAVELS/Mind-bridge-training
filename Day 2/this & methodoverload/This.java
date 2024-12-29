import java.util.*;
class Emp
{
    int ID;
    String Name;
    int salary;
    
    Emp(int ID,String Name,int salary)
    {
        this.ID=ID;
        this.Name=Name;
        this.salary=salary;
    System.out.println(ID);
    System.out.println(Name);

    System.out.println(salary);
    }

}
class This
{
    public static void main(String args[])
    {
        Emp em=new Emp(01,"john",10000);
    }
}