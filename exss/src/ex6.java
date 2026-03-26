import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        double x = sc.nextDouble();

        // Cálculo
        double y = Math.sqrt(Math.cbrt(x - 0.5));

        // Saída com 3 casas decimais
        System.out.printf("%.3f%n", y);

        sc.close();
    }
}
