class Base
{
   final public void fun()  //Defination
    {}
   final public void gun()  //Defination
    {}
}

class Derived extends Base
{
    public void run()  //Defination
    {}
    public void gun()  //Overriding
    {}
}

class FinalMethod1
{
    public static void main(String a[])
    {
        Derived dobj = new Derived();
    }
}