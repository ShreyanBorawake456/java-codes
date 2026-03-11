class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerialAlive
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");

        try
        {
            dobj1.start();
            System.out.println("Is first thread Alive? :"+dobj1.isAlive());
            dobj1.join();
            System.out.println("End of first thread");

            dobj2.start();
            System.out.println("Is Second thread Alive? :"+dobj2.isAlive());
            dobj2.join();
            System.out.println("End of Second thread");
        }

       catch(InterruptedException iobj)
       {}

        System.out.println("End of main Thread");
    }
}