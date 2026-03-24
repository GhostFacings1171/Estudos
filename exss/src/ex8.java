import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de três dígitos: ");
        int numero = scanner.nextInt();

        int dezena = (numero / 10) % 10;

        System.out.println("A dezena do número é " + dezena);

        scanner.close();
    }
}

