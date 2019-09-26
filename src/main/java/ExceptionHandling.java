//import java.sql.SQLOutput;

public class ExceptionHandling
{

    public static void main(String[] args)
    {
        int a=100;
        int b=0;
        int c;
Student s1= new Student(1, "Charan");
        int x[]={1,2,3};
        System.out.println("START");
        try {
            x[2]=1000;
            c = a / b;
            System.out.println(" C:\t" + c);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Value of b=0, Divisible by Zero Error");
        }
        catch (Exception e) {
            System.out.println("Array Index out of bound");
        }
        finally{
            System.out.println("finally block");
        }

        /*catch (Exception e){
            System.out.println(e.toString());
        }*/


        System.out.println("END");

        public void finalize()
        {
            System.out.println("Finalize() block");
        }

s1=null;
        //System.gc();//don't use in practical






    }
}
