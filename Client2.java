package projeto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// projeto.Client class
class Client2 {

    // driver code
    public static void main(String[] args)
    {
        // establish a connection by providing host and port
        // number
        try {



            // object of scanner class
            Scanner sc = new Scanner(System.in);
            String line = null;

            while (!"exit".equalsIgnoreCase(line)) {

                // reading from user
                line = sc.nextLine();
                Socket socket;
                switch (Calculator.selectServer(line)){
                    case 1:
                        socket = new Socket("localhost", 8888);
                        break;
                    case 2:
                        socket = new Socket("localhost", 9999);
                        break;
                    default:
                        line="exit";
                        return;
                }

                // writing to server
                PrintWriter out = new PrintWriter(
                        socket.getOutputStream(), true);

                // reading from server
                BufferedReader in
                        = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));

                // sending the user input to server
                out.println(line);
                out.flush();

                // displaying server reply
                System.out.println(in.readLine());
            }

            // closing the scanner object
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
