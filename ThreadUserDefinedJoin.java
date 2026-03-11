class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoin
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");
        
        dobj1.start();
        dobj2.start();
           
         

        System.out.println("End of main Thread");
    }
}