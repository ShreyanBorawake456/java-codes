class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("inside default constructor");

    }

    public Demo(int i,int j)
    {
        System.out.println("inside parameterised constructor");
    }

    protected void finalize()
    {
        System.out.println("inside finalize");
    }
}

class constructorDestructor
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of main");

    }
}