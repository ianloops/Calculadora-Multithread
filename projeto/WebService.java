import spark.Spark;

public class WebService {
    public static void main(String[] args) {
        Spark.port(8887); // Define a porta do Web Service

        // Rota para o cálculo
        Spark.get("/add/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor1", "add", num1, num2);
            return result;
        });
        Spark.get("/subtract/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor1", "subtract", num1, num2);
            return result;
        });
        Spark.get("/multiply/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor1", "multiply", num1, num2);
            return result;
        });
        Spark.get("/divide/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor1", "divide", num1, num2);
            return result;
        });
        Spark.get("/exp/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor2", "exp", num1, num2);
            return result;
        });
        Spark.get("/porc/:num1/:num2", (request, response) -> {
            int num1 = Integer.parseInt(request.params(":num1"));
            int num2 = Integer.parseInt(request.params(":num2"));
            String result = Router.routerOperation("Servidor2", "porc", num1, num2);
            return result;
        });
         Spark.get("/raiz/:num1", (request, response) -> {
             int num1 = Integer.parseInt(request.params(":num1"));
             String result = Router.routerOperation("Servidor2", "raiz", num1, 0);
             return result;
         });
    }
}
