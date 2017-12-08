import java.io.*;
import java.net.*;
import java.util.*;

public class ProcessRequest implements Runnable{

    Socket cliente;
    StringBuffer mensaje;
    Vector q;
    
    public ProcessRequest (Socket cliente, Vector q)
    {
        this.cliente = cliente;
        this.q = q;

    }

    public void run(){
        int c;

        mensaje = new StringBuffer();
        try {

            BufferedInputStream bis = new BufferedInputStream (cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            BufferedOutputStream bos = new BufferedOutputStream (cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter (bos);

            while((c = isr.read())!= (char)13){
                mensaje.append((char)c);
            }
            System.err.println("el cliente dice:" + mensaje);
            q.add(mensaje);
            osw.write("Request accepted" + (char)13);
            osw.flush();
            cliente.close();

        } catch (IOException ex) {
            //TODO: handle exception
        }
       

    }
}