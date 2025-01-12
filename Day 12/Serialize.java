import java.util.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Seri implements Serializable
{
    String str="name";
    int name=123;
    
    
}
class Main 
{
    public static void main (String[] args) {
        Seri seri=new Seri();
        try {
            
        FileOutputStream fi=new FileOutputStream("exe.txt");
        ObjectOutputStream out=new ObjectOutputStream(fi);
        
        out.writeObject(seri);
        fi.close();
        out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}