import java.util.*;
class Main 
{
 public static void main (String[] args) {
        Stack<String> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        StringBuilder ct=new StringBuilder();
        
        System.out.print("Add word");
        String st1=sc.nextLine();
        st.push(st1);
        ct.append(st1).append("");
                System.out.print("Add word");

          String st2=sc.nextLine();
          st.push(st2);
                  ct.append(st2).append("");

          
          
                  System.out.print("Undo last word");
                  String lasta=st.pop();
                  int inde=ct.lastIndexof(lasta);
                  
                  ct.delete(inde,inde+lasta.length()+1);

                  System.out.print("Add word");

           String st3=sc.nextLine();
                   ct.append(st3).append("");
                   
                   System.out.print("Current Text"+ct.toString());

        
    }
}