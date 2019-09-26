public class ExceptionHandling
{

    public static void main(String[] args)
    {
        int a=100;
        int b=0;
        int c;
        System.out.println("START");
        try {
            c = a / b;
            System.out.println(" C:\t" + c);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Value of b=0, Divisible by Zero Error");
        }

        System.out.println("END");









    }
}
