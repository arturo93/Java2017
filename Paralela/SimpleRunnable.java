public class SimpleRunnable implements Runnable
{
Thread t;

    public void run ()
    {
        System.out.println("Nombre del hilo"+ t.getName());
        System.out.println("el hilo"+ t.getName() +"tiene prioridad"+ t.getPriority());
        System.out.println("el hilo"+t.getName()+"esta esperando");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException ex)
        {

        }
        System.out.println("el hilo"+t.getName()+ "termino");
    }
    public SimpleRunnable(String name)
    {
        t = new Thread(this,name);
        t.start();
    }
    public static void main(String[]args)
    {
        SimpleRunnable a = new SimpleRunnable("uno");
        SimpleRunnable b = new SimpleRunnable("dos");
        SimpleRunnable c = new SimpleRunnable("tres");
        SimpleRunnable d = new SimpleRunnable("cuatro");
        SimpleRunnable e = new SimpleRunnable("cinco");
    }
}