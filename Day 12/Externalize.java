import java.io.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.Serializable;

class Seri implements Externalizable
{
    private int id=123;
    private String str="name";
    
    public Seri()
    {
     System.out.println("constructor call") ;  
    }
    
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeInt(id);
        out.writeObject(str);
    }
    
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
    {
       id= in.readInt();
       str=(String) in.readObject();
    }
    
    public String toString()
    {
      return id+" "+str;  
    }
}
class Main 
{
    public static void main(String args[])
    {
        Seri se=new Seri();
        try {
            
        FileOutputStream fi=new FileOutputStream("exe.txt");
        ObjectOutputStream out=new ObjectOutputStream(fi);
        
        out.writeObject(se);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        
        try {
            
            FileInputStream fii=new FileInputStream("exe.txt");
        ObjectInputStream in=new ObjectInputStream(fii);
        
        Seri see=(Seri) in.readObject();

        } 
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}