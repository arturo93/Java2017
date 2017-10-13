public class SimpleThread extends Thread
{
    public void run ()
    {
        System.out.println("soy un hilo");

    }
    public static void main (String[] args)
    {
        SimpleThread s = new SimpleThread();
        //s.setDaemon(true);
        s.start();
    }
}