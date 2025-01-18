package Palindrome;
import java.util.*;


public class Palindrome {



        public   boolean rev(String st)
        {
            if(st==null)
            {
                return false;
            }
            int n=st.length();


            String stt="";
            for(int i=n-1;i>=0;i--)
            {
                stt+=st.charAt(i);
            }
            if(stt.equals(st))
            {
                return true;
            }
            else {
                return false;
            }
        }


}
