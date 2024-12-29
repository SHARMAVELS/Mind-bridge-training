import java.util.*;
class Book
{
    String author;
    String Title;
    Book()
    {
        author="john";
        Title="fairy tales";
    }
    void details()
    {
        System.out.print(author+" book is "+Title);
    }
}
class Default
{
     public static void main (String[] args) {
        Book bk=new Book();
        bk.details();
    }
}