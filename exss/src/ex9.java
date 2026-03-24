import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de três dígitos: ");
        int numero = scanner.nextInt();

        // Extrair dígitos
        int unidades = numero % 10;
        numero /= 10;
        int dezenas = numero % 10;
        numero /= 10;
        int centenas = numero % 10;

        // Montar invertido: unidades*100 + dezenas*10 + centenas*1
        int invertido = unidades * 100 + dezenas * 10 + centenas;

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}

