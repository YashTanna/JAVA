import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

class EchoServer{
    public static void main(String args[]){
        try {
            System.out.println("Waiting for Clients....");
            ServerSocket ss = new ServerSocket(1234);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server say : "+str);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}