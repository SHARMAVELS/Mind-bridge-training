import java.util.*;
class Book
{
  String Tittle;
  String Author;
  int edition;
  
  Book()
  {
      this.Tittle="Fairy tales";
      this.Author="james";
      this.edition=1993;
      
      
  }
  
  
}
class Librarian extends Book
{
    String Name;
    int ID;
    
    String Tittle1;
    String Author2;
    
    Librarian()
    {
        Name="john";
        ID=001;
    }
   
    
    
    
    
}
class Member extends Librarian
{
    String Namem;
    String Bookneeded;
    String Authorname;
    
    public void details()
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your name :");
       Namem=sc.nextLine();
       System.out.print("Enter book Tittle :");
       Bookneeded=sc.nextLine();
       System.out.print("Enter author name :");
       Authorname=sc.nextLine();
       
    }
    public void checking()
    {
        if(Bookneeded.equals(Tittle) || Author2.equals(Author))
        {
            System.out.print("Book "+Bookneeded+ " is avail and provided by "+Name+" provides to Name "+Namem);
        }
        else{
            System.out.print("Book not avail");
        }
    }
    
}
public class Librarymanagement
{
    public static void main (String args[]) {
        Member mem=new Member();
        mem.details();
        mem.checking();
    }
}