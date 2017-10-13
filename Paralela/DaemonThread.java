import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;

public class DaemonThread extends JFrame implements Runnable


{
    private Thread t;
    public DaemonThread()
    {
        setUndecorated(true);
        setSize(new Dimension(150,150));
        getContentPane().add(new JLabel("Tazmanian devil"), BorderLayout.CENTER);
        pack();
        setLocation(50,50);
        setVisible(true);

        t= new Thread(this,"demonio");
        t.setDaemon(true);
        t.start();
    }
    public static void main (String[]args)
    {
        DaemonThread d = new DaemonThread();

    }
    public void run ()
    {
        while(true)
        {
            setVisible(true);
            try
            {
                Thread.sleep(2000);
                setVisible(false);
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {

            }
        }
    }   
        
    
} 
