import java.util.*;
class Bankacc
{
    private int accnum;
    private int balance;
    Bankacc(int acc,int bal)
    {
        this.accnum=acc;
        this.balance=bal;
    }
    void withdrawl(int amt)
    {
        balance=balance-amt;
        System.out.print("Balace is :"+balance);
    }
    
}
class Main
{
    public static void main(String args[])
    {
        Bankacc c=new Bankacc(1234,250);
        c.withdrawl(100);
        
    }
}