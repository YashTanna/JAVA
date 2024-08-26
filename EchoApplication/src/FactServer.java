import java.net.*;
import java.io.*;

public class FactServer {
    public static void main(String args[]){
        try{

            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(1234);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Factorial of number "+ number+" is "+Fact(number));

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    static int Fact(int num)
    {

        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }

}
