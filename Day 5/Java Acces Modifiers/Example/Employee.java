package Example;

 public class Employee extends Person{
    public  Employee(String Name,int age,String address,int salary)
     {
         super(Name,age,address,salary);
     }
    public void details()
    {
        System.out.println(Name);
        System.out.println(age);
        System.out.println(address);
    }


}

