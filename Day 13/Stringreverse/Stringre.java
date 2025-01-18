package STR;
import java.util.*;

public class Stringre {
    public  String rev(String st)
    {
        if(st==null)
        {
            return "null";
        }
        int n=st.length();


        String stt="";
        for(int i=n-1;i>=0;i--)
        {
            stt+=st.charAt(i);
        }
        return stt;
    }
}
