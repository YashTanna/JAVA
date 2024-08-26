import java.net.*;
import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;

public class FactClient {
    public static void main(String args[]){
        try{

            System.out.println("Client Started");
            Socket soc = new Socket("localhost",1234);

            System.out.println("Enter number");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(number);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
