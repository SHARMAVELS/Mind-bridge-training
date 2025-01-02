import java.util.*;
class Account
{
    int AccountNum;
    String name;
    int balance;

    Account(int acc,String nam)
    {
        AccountNum=acc;
        name=nam;

    }
}
class Deposite extends Account
{
    int amount;
    Deposite(int AccountNum,String name,int am)
    {
        super(AccountNum,name);
        amount=am;
    }
}
class Withdrawl extends Deposite
{
    int debit;
    Withdrawl(int AccountNum,String name,int amount,int deb)
    {
        super(AccountNum,name,amount);
        debit=deb;
    }
}
class Checkbalance extends Withdrawl
{
    Checkbalance(int AccountNum,String name,int amount,int debit) {
        super(AccountNum,name,amount,debit);
    }
    void calc()
    {
        int balance=250;
        int totbal;
        totbal=(balance+amount)-debit;
        System.out.print("Your Account balance: "+totbal);
    }

}
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Name: ");
        String str=sc.next();
        System.out.println("Your Account balance is 250");


        System.out.print("Enter credit amount: ");
        int am=sc.nextInt();
        System.out.print("Enter Withdrawl amount: ");
        int wth=sc.nextInt();



        Checkbalance ch=new Checkbalance(a,str,am,wth);
        ch.calc();
    }
}