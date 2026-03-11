interface A
{
    int no = 11;
    void Fun();
    default void Gun()
    {
        System.out.println("inside gun"); 
    }
}

class Demo implements A
{
    public void Fun()
    {
        System.out.println("inside fun");   

    }

}

class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();

    }
}