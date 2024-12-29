import java.util.*;
class Animal
{
    void speak()
    {
        System.out.println("animal make sound");
    }
}
class Dog extends Animal
{
    void speak()
    {
        System.out.println("bow");
    }
}
class Cat extends Animal
{
    void speak()
    {
        System.out.print("meow");
    }
}
class Inheritence
{
    public static void main(String args[])
    {
        Animal ani=new Animal();
        ani.speak();
        
        Animal dog=new Dog();
        dog.speak();
        
        Animal cat=new Cat();
        cat.speak();
        
    }
}