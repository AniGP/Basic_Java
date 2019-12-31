package BasicOperations;

 class Sum
{
    static int S;
    public static void main(int a, int b)
    {
        S=a+b;
        System.out.println("S = " + S);
    }
}

class Product extends Sum
{
    public static void Pro(int x, int y)
    {
        S=x*y;
         
    }
}