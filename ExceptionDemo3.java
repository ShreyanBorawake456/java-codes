import java.util.*;
class ExceptionDemo3
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
        catch(ArithmeticException aobj)
        {
            System.out.println("inside catch block:");
            System.out.println(aobj);
            
        }
        
        System.out.println("The division is :"+iAns);
    }

}