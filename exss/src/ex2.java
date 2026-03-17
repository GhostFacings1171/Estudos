import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("CONVERSOR DE CELCIUS EM FARENHEINT:");
        System.out.println("");
        System.out.println("");
        System.out.println("Escreva o valor em Celcius: ");
        Double cel = scn.nextDouble();
        Double fahr = cel * 9/5 + 32;
        System.out.println("O valor em Fahrenheint é: " + fahr);
    }
}
