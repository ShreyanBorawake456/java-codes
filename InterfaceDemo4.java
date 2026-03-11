interface A
{
    void Fun();

}

interface B
{
    void Gun();
}

class Demo implements A,B
{
    public void Fun()
    {
        System.out.println("inside fun");

    }
    public void Gun()
    {
        System.out.println("inside gun");

    }
}

class InterfaceDemo4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();
    }
}