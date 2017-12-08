import java.io.*;
import java.net.*;
import java.util.*;

public class MultiThreadSocket{
    public static void main(String[] args) {
        Vector q = new Vector();
        try {
            int port = 1111;
            ServerSocket server = new ServerSocket(port);
            Socket clientes;

        

            for (int i=0;i<=10;i++) {

                clientes = server.accept();
                ProcessRequest other = new ProcessRequest (clientes,q);
                Thread t = new Thread (other);
                t.start();
                
            }
        for (int i=0;i<q.size();i++) {
            System.out.println(q.get(i)); 
            
        }
            
        } catch (IOException ex) {
            
        }
    }
}