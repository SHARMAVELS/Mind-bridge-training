class Primitivedatatype
{
    public static void main(String args[])
    {
        byte by = 100;
        short sh = 30000;
        int in = 123456789;
        long lo = 987654321;
        float flo = 1.12f;
        double doub = 123.1234;
        char ch = 'A';
        boolean bool = true;

        System.out.println("byte = "+by);
        System.out.println("short = "+sh);
        System.out.println("int = "+in);
        System.out.println("long = "+lo);
        System.out.println("float = "+flo);
        System.out.println("double = "+doub);
        System.out.println("char = "+ch);
        System.out.println("bool = "+bool);

        int conversion=(int)doub;
        System.out.print("Type conversion double to int ="+conversion);

    }
}
