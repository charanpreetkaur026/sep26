public class ExceptionHandling
{

    public static void main(String[] args)
    {
        int a=100;
        int b=0;
        int c;

        int x[]={1,2,3};
        System.out.println("START");
        try {
            x[4]=1000;
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
