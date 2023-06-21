import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor1 {

    public static void main(String[] args) {
        int port = 8888; // Define a porta do servidor 1

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor 1 aguardando conexão na porta " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();

                System.out.println("Conexão recebida do cliente: " + clientSocket.getInetAddress().getHostAddress());

                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ) {
                String operation = in.readLine();
                int num1 = Integer.parseInt(in.readLine());
                int num2 = Integer.parseInt(in.readLine());

                double result = 0;
                
                switch (operation) {
                    case "add":
                        result = Calculator.add(num1, num2);
                        break;
                    case "subtract":
                        result = Calculator.subtract(num1, num2);
                        break;
                    case "multiply":
                        result = Calculator.multiply(num1, num2);
                        break;
                    case "divide":
                        result = Calculator.divide(num1, num2);
                        break;
                
                    default:
                        out.println("Operação inválidaa");
                        clientSocket.close();
                        break;
                }

                out.println(result);
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
