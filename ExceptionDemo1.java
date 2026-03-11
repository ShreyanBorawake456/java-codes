import java.util.*;
class ExceptionDemo1
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

        iAns = iNo1 / iNo2;
        System.out.println("The division is :"+iAns);
    }

}