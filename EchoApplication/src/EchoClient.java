import java.io.*;
import java.net.*;

class EchoClient{
    public static void main(String args[]){
        try {
            System.out.println("Client started");
            Socket ss = new Socket("localhost", 1234);
            System.out.println("Enter String ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(ss.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            System.out.println(in.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}