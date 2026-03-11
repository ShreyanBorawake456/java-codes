final class Base
{
    public void fun()
    {
        system.out.println("Inside Base fun");

    }
}

class Derived
{
    public Base bobj; //composition

    public Derived()
    {
        bobj = new Base();
    }

}

class FinalClass2
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.bobj.fun();
    }
}