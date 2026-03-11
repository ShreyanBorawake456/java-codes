import java.util.*;
class ExceptionDemo7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("enter first number:");
        iNo1 = sobj.nextInt();

        System.out.println("enter Second number:");
        iNo2 = sobj.nextInt();
        try
        {
            System.out.println("inside try block:");
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException aobj)   //Specific catch
        {
            System.out.println("inside catch block:");
            System.out.println(aobj);
            
        }
        catch(Exception eobj) // generic catch
        {
            System.out.println("inside generic catch block:");   
        }
        finally
        {
           System.out.println("inside finally block:");  
        }
        System.out.println("The division is :"+iAns);
    }

}