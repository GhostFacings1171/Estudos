import java.sql.SQLOutput;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Adicione as horas trabalhadas:");
        int hr = scn.nextInt();
        System.out.println("Adcione o valor da hora-aula: ");
        Double vlr = scn.nextDouble();

        double slb = hr * vlr;
        System.out.println("O salário bruto é: " + slb);
        double inss = slb * 22/100;
        System.out.println("O valor do inss é : " + inss);
        double sll = slb - inss;
        System.out.println("O salario líquido é: " + sll);
        System.out.printf("O salário liquido com 2 casas decimais é: %.2f", sll);
    }
}
