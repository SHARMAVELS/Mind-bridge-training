import java.util.*;
abstract class Shape
{
    abstract void CalculateArea();
}
class Circle extends Shape
{
    int radius;
    
    Circle(int radius)
    {
        this.radius=radius;
    }
    void CalculateArea()
    {
        System.out.println(Math.PI*radius*radius);
    }
    
}
class Rectangle extends Shape
{
    int length;
    int breath;
    
    Rectangle(int length,int breath)
    {
        this.length=length;
        this.breath=breath;
    }
    
     void CalculateArea()
    {
        System.out.println(length*breath);
    }
    
}

class Abstract
{
     public static void main (String[] args)
    {
     Circle cr=new Circle(5);
     cr.CalculateArea();
     
     Rectangle re=new Rectangle(2,4);
     re.CalculateArea();
     
    }
}
