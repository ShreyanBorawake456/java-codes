class ThreadDemo1
{
    public static void main(String A[]) // main itself is a thread created by JVM 

    {
        System.out.println("Inside main method");
        String name = Thread.currentThread().getName();  // current thread = refrence of main
                                                        // get name fetches the name of thread
        System.out.println("name of current thread is:"+name);
    }
}