import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o valor salário mínimo: ");
        double salmn = scn.nextDouble();
        System.out.println("Informe a quantidade de Quilowatt: ");
        int qwt = scn.nextInt();
        double vlrqwt = (salmn / 7) / 100;
        double conta = qwt * vlrqwt;
        System.out.println("Valor da conta: R$" + conta);
        System.out.println("Valor do quilowatt: R$" + vlrqwt);
        System.out.println("Valor da conta com 10% de desconto: R$" + conta * 0.9);
    }
}