package projeto;

import java.util.Arrays;

public class Calculator {

    public static Integer selectServer(String line) {
        if (line.contains("+") || line.contains("-") || line.contains("*") || line.contains("/")) {
            return 1;
        }
        if (line.contains("%") || line.contains("^") || line.contains("sqrt")) {
            return 2;
        }
        return 0;
    }
    public static float sum(String line){
        String[] values = line.split("\\+");
        System.out.println(Arrays.toString(values));
        return Float.parseFloat(values[0]) + Float.parseFloat(values[1]);
    }
    public static float sub(String line){
        String[] values = line.split("-");
        System.out.println(Arrays.toString(values));
        return Float.parseFloat(values[0]) - Float.parseFloat(values[1]);
    }
    public static float prod(String line){
        String[] values = line.split("\\*");
        System.out.println(Arrays.toString(values));
        return Float.parseFloat(values[0]) * Float.parseFloat(values[1]);
    }
    public static float div(String line){
        String[] values = line.split("/");
        System.out.println(Arrays.toString(values));
        return Float.parseFloat(values[0]) / Float.parseFloat(values[1]);
    }
    public static double pct(String line){
        String[] values = line.split("%");
        System.out.println(Arrays.toString(values));
        return Float.parseFloat(values[1]) / 100 * Float.parseFloat(values[0]);
    }
    public static double pow(String line){
        String[] values = line.split("\\^");
        System.out.println(Arrays.toString(values));
        return Math.pow(Float.parseFloat(values[0]) ,Float.parseFloat(values[1]));
    }
    public static double sqrt(String line){
        String[] values = line.split("sqrt");
        System.out.println(Arrays.toString(values));
        return Math.sqrt(Float.parseFloat(values[1]));
    }

}
