class Base
{
    public int i,j;
    public void fun()
    {
        System.out.println("Inside base fun");

    }
    public void gun()
    {
        System.out.println("Inside base gun");

    }
    public void sun()
    {
        System.out.println("Inside base sun");

    }
    public void bun()
    {
        System.out.println("Inside base bun");

    }    
}

class   Derived extends Base
{
    public int x;
    public void gun()
    {
        System.out.println("Inside Derived gun");

    }    
    public void sun()
    {
        System.out.println("Inside Derived sun");

    }
    public void run()
    {
        System.out.println("Inside Derived run");

    }
    public void mun()
    {
        System.out.println("Inside Derived fun");

    }            
}

class RMDDemo2
{
    public static void main(String A[])
    {
       Base bp = new Derived();  //Upcasting

       bp.fun();
       bp.gun();      
       bp.sun();
       //bp.run();  //ERROR cuz its not present in base
       //bp.mun();  //ERROR cuz its not present in base
       bp.bun();
    }
}