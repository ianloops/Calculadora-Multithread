public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return (double) num1 / num2;
    }

    public static double porc(int num1, int num2) {
        return (double) (num1 * 100) / num2;
    }

    public static double exp(int num1, int num2) {
        return Math.pow(num1,num2);
    }

    public static double raiz(int num1) {
        return Math.sqrt(num1);
    }
}
