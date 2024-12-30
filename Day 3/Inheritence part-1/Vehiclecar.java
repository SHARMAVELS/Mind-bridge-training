import java.util.*;
class Vehicle
{
  void start()
  {
      System.out.println("Vehicle is starting");
  }
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car starting");
    }
}
class Vehiclecar
{
    public static void main(String args[])
    {
        Vehicle ve=new Vehicle();
        ve.start();
        Car c=new Car();
        c.start();
        Vehicle veh=new Car();
        veh.start();
    }
}