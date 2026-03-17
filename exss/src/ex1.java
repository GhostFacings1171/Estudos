import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insira o valor da base do retângulo: ");
        Double base = scn.nextDouble();
        System.out.println("Insira o valor da altura do retâgulo: ");
        Double altura = scn.nextDouble();
        Double per = (2 * base) + (2 * altura);
        System.out.println("O Perimetro do retângulo é: " + per);
        Double area = base * altura;
        System.out.println("A Área do retângulo é: " + area);
    }
}
