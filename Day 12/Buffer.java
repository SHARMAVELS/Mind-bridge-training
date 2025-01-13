import java.util.*;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;


class Main 
{
    public static void main (String[] args) {
        CharBuffer bu= CharBuffer.allocate(8);
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            bu.put(ch);
        }
        
        int n1=bu.position();
        System.out.println("Position is: "+n1);
        
        bu.flip();
        
        int n2=bu.position();
        System.out.println("After flip position: "+n2);
        
        ByteBuffer by=ByteBuffer.allocate(6);
        for(int j=0;j<by.limit();j++)
        {
            int jj=sc.nextInt();
            by.put((byte)jj);
        }
        
        int n3=by.position();
        System.out.print("Position is: "+n3);
        
    }
}