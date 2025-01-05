import java.util.*;
import java.lang.Math.*;
class Hypotenus
{
    public void check(int sq,int po)
    {
        System.out.print(Math.sqrt(Math.pow(sq,2)+Math.pow(po,2)));
    }
}
class Main
{
    public static void main(String[] args) {
        Hypotenus hy=new Hypotenus();
        hy.check(2,3);
    }
}