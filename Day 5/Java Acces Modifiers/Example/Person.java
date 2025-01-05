package Example;

public class Person {
    public static String Name;
    protected int age;
    String address;
    private static int salary;

    public Person(String nam,int ag,String add,int sal)
    {
        Name=nam;
        age=ag;
        address=add;
        salary=sal;
    }
    public static void detail()
    {
        System.out.println(salary);
    }
}
