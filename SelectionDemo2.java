import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int istd = 0;
        System.out.println("enter your standard:");

        istd = sobj.nextInt();

        if (istd == 1)
        {
            System.out.println("Exam at 9AM");         
        }
        else if(istd == 2)
        {
            System.out.println("Exam at 10AM");
        }
        else if(istd == 3)
        {
            System.out.println("Exam at 11AM");
        }
        else if(istd == 4)
        {
            System.out.println("Exam at 12AM");
        }
        else 
        {
            System.out.println("invalid Standard");
            
        }
    }
}