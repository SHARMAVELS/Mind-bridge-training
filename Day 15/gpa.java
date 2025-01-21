import java.util.*;
class Lamda
{
    String name;
    double gpa;
    
   public Lamda(int name,int gpa)
   {
       this.name=name;
       this.gpa=name;
   }
   
   public String GetName()
   {
       return name;
   }
   public double GetGpa()
   {
     return gpa;
   }
   
   public String toString()
   {
       return name+" "+gpa;
   }
}
class Main
{
    public void studentbydese(List<Lambda> li)
    {
        li.sort((s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()));
    }
    public static void main (String[] args) {
        
        List<Lambda> li=new ArrayList<>();
        li.add(new Lambda("john",4.1));
                li.add(new Lambda("joe",4.3));

        li.add(new Lambda("don",3.0));
        
        studentbydese(li);
        System.out.print("After sorting");
        for(Student student:li)
        {
            System.out.print(student);
        }

        
    }
}