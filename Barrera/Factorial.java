import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class Factorial extends Thread
{
    int num;
    CyclicBarrier barrera;
    int resultado ;
    public int getResultado()
    {
        return resultado;
    }
    public Factorial (int num , CyclicBarrier barrera)
    {
        this.num = num;
        this.barrera= barrera;
    }
 public void run ()
 {
     try
     {
        resultado =factorial(num);
        barrera.await();
        System.out.println("Acabeeeeee la operacion ");
     }
     catch(InterruptedException ex)
     {
         
     }
     catch (BrokenBarrierException ex)
     {

     }
    

 }
 int factorial (int n)
 {
     int accum =1;
     for(int i = n; i>0 ;i--)
     {
         accum *= i;
     }
     return accum;
 }

}