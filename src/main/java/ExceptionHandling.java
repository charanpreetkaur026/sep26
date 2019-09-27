//import java.sql.SQLOutput;

import java.io.IOException;

public class ExceptionHandling
{

    public static void main(String[] args)
    {
        int a=100;
        int b=20;
        int c;
        String name="hello";
Student s1= new Student(1, "Charan");
        int x[]={1,2,3};
        System.out.println("START");
        try {
            x[2]=1000;
            c = a / b;
            System.out.println(" C:\t" + c);
            /*if (b!=10){
                throw new ArithmeticException( "Don't divide by 10");

            }*/
            if(name.length()<10){
                throw new NameLengthException("Name must have length>=10");
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.toString());
            //System.out.println("Value of b=0, Divisible by Zero Error");
        }
        catch (NameLengthException ae){
            System.out.println(ae.toString());
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

        /*public void finalize()
        {
            System.out.println("Finalize() block");
        }

s1=null;
        //System.gc();//don't use in practical*/

        try {
            try {
                s1.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NameLengthException e) {
            e.printStackTrace();
        }


    }
}
