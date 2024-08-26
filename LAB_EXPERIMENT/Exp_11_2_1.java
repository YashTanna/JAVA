// Chat Client

import java.io.*;
import java.net.*;

public class Exp_11_2_1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ChatClient <hostname> <port>");
            return;
        }

        String hostname = args[0];
        int port = Integer.parseInt(args[1]);

        try (Socket socket = new Socket(hostname, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to the server. Start chatting:");

            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            String userInput;
            while ((userInput = reader.readLine()) != null) {
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}