import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Seri implements Serializable
{
    String str="name";
    int name=123;
}

class Main 
{
    public static void main (String[] args) {
        try {
            
        FileInputStream fi=new FileInputStream("exe.txt");
        ObjectInputStream in=new ObjectInputStream(fi);
        
        Seri se=(Seri) in.readObject();
        fi.close();
        in.close();
        
        System.out.print(se.name);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}