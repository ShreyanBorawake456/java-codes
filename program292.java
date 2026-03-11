import java.util.*;

class Program292
{
    public static void main(String A[])
    {
        int Arr[] = {45,21,90,54,78};

        for(int no : Arr)
        {
            System.out.println(no);
        }
        Arrays.sort(Arr);
        System.out.println("sorted array is ");
        for(int no : Arr)
        {
            System.out.println(no);
        }
    }
}