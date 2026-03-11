class Hello
{
    public int i;
    public Hello(int no)
    {
        System.out.println("Inside hello Connstructor");
        this.i = no+1;
    }
    public void Display()
    {
        System.out.println("Inside Base Display function");
    }
}

class Demo extends Hello 
{
    public int i;

    public Demo(int a)
    {
        super(a);   // first use   upar base ko call jaega
        System.out.println("Inside Demo Constructor");
        this.i = a;
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display"+i);  // 0
        System.out.println("Inside Display"+this.i);  // 51
        System.out.println("Inside Display"+super.i);  // 52 second use
        super.Display();  // Third use
    }
}
class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}