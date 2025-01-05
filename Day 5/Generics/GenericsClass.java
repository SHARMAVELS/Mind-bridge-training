import java.util.*;
class Pair<K,V>
{
    K key;
    V value;
    
    public Pair(K key,V value)
    {
        this.key=key;
        this.value=value;
    }
    
    public K getkey()
    {
        return key;
    }
    public V getvalue()
    {
        return value;
    }
    
    public String toString()
    {
        return key+" "+value;
         }
}
class GenericsClass
{
    public static void main (String[] args) {
        
        Pair<Integer,String> pair1=new Pair<>(1,"hello");
        System.out.println("Pair1 "+pair1);
        
        Pair<String,String> pair2=new Pair<>("hi","hi");
        System.out.println("pair2 "+pair2);
    }
}