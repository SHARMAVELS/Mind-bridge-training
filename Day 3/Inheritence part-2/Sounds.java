import java.util.*;
class Animal
{
    void sound()
    {
      System.out.println("Animal sound");  
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("bow");
    }
}
class Cat extends Animal{
    void sound()
    {
       System.out.println("Meow"); 
    }
}
class Sounds
{
    public static void main(String args[])
    {
        Animal an=new Animal();
        an.sound();
        
        Animal dog=new Dog();
        dog.sound();
        
        Animal Cat=new Cat();
        Cat.sound();
    }
}
