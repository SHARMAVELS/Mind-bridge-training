package testaccess;
import Example.Person;
import Example.Employee;

public class TestAccess  {


    public static void main(String[] args) {

        Person pr=new Person("john",25,"chennai 600 028",35000);
        System.out.println(Person.Name);
        Person.detail();

        Employee emp=new Employee("john",25,"chennai 600 028",35000);
        emp.details();

    }
}
