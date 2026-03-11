interface A
{
    void Fun();

}

interface B
{
    void Fun();
}

class Demo implements A,B
{
    public void Fun()
    {
        System.out.println("inside fun");

    }

}

class InterfaceDemo5
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Fun();
       
    }
}