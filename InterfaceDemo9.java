interface A
{
    int no = 11;
    void Fun();
    private void Display()
    {
        System.out.println("inside Display"); 
    }
    default void Gun()
    {
        System.out.println("inside gun");
        Display(); 
    }
}

class Demo implements A
{
    public void Fun()
    {
        System.out.println("inside fun");   

    }

}

class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();
        //dobj.Display(); ERROR

    }
}