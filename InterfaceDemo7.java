interface A
{
    int no = 11;
    void Fun();

}

interface B
{
    int no = 21;
    void Fun();
}

class Demo implements A,B
{
    public void Fun()
    {
        System.out.println("inside fun"+A.no);   

    }

}

class InterfaceDemo7
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Fun();
       
    }
}