import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        double x = sc.nextDouble();

        // Cálculo
        double parte = (Math.pow(x, 4) - 1) / (2 * Math.pow(x, 2));
        double y = Math.sqrt(1 + Math.pow(parte, 2) - (Math.pow(x, 2) / 2));

        // Saída com 3 casas decimais
        System.out.printf("%.3f%n", y);

        sc.close();
    }
}