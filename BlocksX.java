
class Demo
{
    public int i;  //instance variable
    static public int j; //class variable

    static
    {
        System.out.println("Inside static block");

        j = 21;
    }
    {
        System.out.println("inside Initializer block");

    }
    public Demo()
    {
        System.out.println("inside constructor");

        this.i = 11;
    }
    public Demo(int a)
    {
      System.out.println("inside parameterised constructor");
      this.i = a;
  
    }
}
class BlocksX 
{
    public static void main(String A[])
    {
        System.out.println("Inside main function");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);

    }
}