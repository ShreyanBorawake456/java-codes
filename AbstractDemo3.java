abstract class Base
{
    public int i,j;

    public int Addition(int a,int b)
    {
        return a+b;
    }
    abstract public int Substraction(int a,int b);

}

class Derived extends Base  
{ 
    public int Substraction(int a,int b)
    {
        return a-b;

    }

    public int Multiplication(int a,int b)
    {
        return a*b;
    }
}

class AbstractDemo3
{
    public static void main(String arr[])
    {
        Base bp = new Derived();  
        int iRet = 0;

        iRet = bp.Addition(10,21);
        System.out.println(iRet);

        iRet = bp.Substraction(21,10);
        System.out.println(iRet);


    }
}