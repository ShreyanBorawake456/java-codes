
class Demo
{
    public int i;  //instance variable
    static public int j; //class variable

    static
    {
        System.out.println("Inside static block");

        j = 21;
    }
    public Demo()
    {
        System.out.println("inside constructor");

        this.i = 11;
    }
}
class Blocks 
{
    public static void main(String A[])
    {
        System.out.println("Inside main function");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();


    }
}