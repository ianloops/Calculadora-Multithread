import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Router {

    public static String routerOperation(String servidor, String operation, int num1, int num2){

            try (
                Socket socket = new Socket("localhost", serverPort(servidor));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
            ) {
                out.println(operation);
                out.println(num1);
                out.println(num2);

                String result = in.readLine();
                return "Resultado do cálculo: " + result;
            } catch (IOException e) {
                e.printStackTrace();
                return "Erro ao conectar com o servidor";
            }
    }
    
    private static int serverPort(String servidor) {
        if (servidor.equals("Servidor1")) {
            return 8888;
        }
        if (servidor.equals("Servidor2")) {
            return 8889;
        } else {
            throw new IllegalArgumentException("Servidor inválido");
        }
    }
}
