import java.util.*;
class Account
{
    int accnum;
    int bal;
    
    Account()
    {
        accnum=1234;
        bal=250;
        System.out.println(accnum+" : "+bal);
    }
    Account(int accnum)
    {
        this.accnum=accnum;
        this.bal=200;
                System.out.println(accnum+" : "+bal);

    }
     Account(int accnum,int bal)
    {
        this.accnum=accnum;
        this.bal=bal;
                System.out.println(accnum+" : "+bal);

    }
}
class Constructor{
 public static void main (String[] args) {
    {
        Account ac=new Account();
                Account ab=new Account(123);
                        Account am=new Account(1234,500);


        
        
    }
 }
}
