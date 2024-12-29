import java.util.*;
class Car{
    
    String Brand;
    int Model;
    int Price;
    int dis;
    
    Car(String br,int Mo,int Pr,int dis)
    {
        this.Brand=br;
        this.Model=Mo;
        this.Price=Pr;
        this.dis=dis;
    }
    void cal()
    {
        dis=(dis*Price)/100;
        Price=Price-dis;
    System.out.print(Price);
}
    }
class Main
{
    public static void main(String args[])
    {
       Car c=new Car("Toyata",2023,200000,5);
       c.cal();
    }
}